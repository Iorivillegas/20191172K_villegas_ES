package edu.uni.pe.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import uni.edu.pe.dto.AerolineaTabla;
import uni.edu.pe.dto.ReporteTabla;
import uni.edu.pe.dto.VueloTabla;
import uni.edu.pe.dto.TramoTabla;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class TablaDaoImpl implements TablaDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private Connection conexion;

    private void obtenerConexion(){
        try {
            this.conexion = jdbcTemplate.getDataSource().getConnection();
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }
    private void cerrarConexion(ResultSet resultado, Statement sentencia){
        try {
            if(resultado != null) resultado.close();
            if(sentencia != null) sentencia.close();
            this.conexion.commit();
            this.conexion.close();
            this.conexion = null;
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
    }

    @Override
    
    public List<ReporteTabla> obtenerReporte() {
        List<ReporteTabla> lista = new ArrayList<>();
        String sql = " SELECT \n" +
                "vu.codigo_origen,vu.codigo_destino,vu.codigo_destino, vu.costo AS costo-vuelo, \n" +
                "vu.nombre_aerolinea, vu.codigo_aerolinea, vu.tipo_vuelo ,vu.estado \n" +
                "FROM \n" +
                "Vuelo vu\n" +
                "INNER JOIN Tramo tr\n" +
                "ON vu.id_vuelo = tr.id_vuelo ;" ;
        try {
            obtenerConexion();
            Statement sentencia = conexion.createStatement();
            ResultSet resultado = sentencia.executeQuery(sql);
            while (resultado.next()){
                lista.add(extraerReporte(resultado));
            }
            cerrarConexion(resultado,sentencia);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return lista;
    }

    @Override
    public AerolineaTabla insertarAerolineaDeTabla(AerolineaTabla aerolineaTabla) {
        String sql = "INSERT INTO AerolineaTabla(id_aerolinea, nombre_aerolinea, codigo_aerolinea) VALUES(?, ?, ?)";
        try {
            obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, AerolineaTabla.getId_aerolinea());
            sentencia.setString(2, AerolineaTabla.getNombre_aerolinea());
            sentencia.setString(3, AerolineaTabla.getCodigo_aerolinea());
            sentencia.executeUpdate();
            cerrarConexion(null,sentencia);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return aerolineaTabla;
    }

    @Override
    public VueloTabla actualizarVueloTabla(VueloTabla vueloTabla) {
        String sql = "UPDATE VueloTabla \n" +
                "SET id_aerolinea = ?, codigo_vuelo = ? ,ciudad_origen = ?, cuidad_destino = ? ,costo = ?, tipo_vuelo = ? ,estado = ? \n" +
                "WHERE id_vuelo = ?;";
        try {
            obtenerConexion();
            PreparedStatement sentencia = conexion.prepareStatement(sql);
            sentencia.setInt(1, vueloTabla.getId_vuelo());
            sentencia.setInt(2, vueloTabla.getId_aerolinea());
            sentencia.setString(3, vueloTabla.getCodigo_vuelo());
            sentencia.setString(4, vueloTabla.getCiudad_origen());
            sentencia.setString(5, vueloTabla.getCiudad_destino());
            sentencia.setInt(6, vueloTabla.getCosto());
            sentencia.setString(7, vueloTabla.getTipo_vuelo());
            sentencia.setString(8, vueloTabla.getEstado());
            sentencia.executeUpdate();
            cerrarConexion(null,sentencia);
        } catch (SQLException throwables) {
            throw new RuntimeException(throwables);
        }
        return vueloTabla;
    }

    private ReporteTabla extraerReporte(ResultSet resultado) throws SQLException {
        ReporteTabla reporte = new ReporteTabla(
                resultado.getString("codigo_vuelo"),
                resultado.getString("ciudad_origen"),
                resultado.getString("ciudad_destino"),
                resultado.getInt("costo"),
                resultado.getString("nombre_aerolinea"),
                resultado.getString("codigo_aerolinea"),
                resultado.getString("tipo_vuelo"),
                resultado.getString("estado"),
                resultado.getString("aeropuerto_llegada"),
                resultado.getString("aeropuerto_salida"),
                resultado.getString("fecha_llegada"),
                resultado.getString("hora_llegada"),
                resultado.getString("fecha_salida"),
                resultado.getString("hora_salida")
        );
        return reporte;
    }
}

