package edu.uni.pe.dao;


import java.util.List;


import uni.edu.pe.dto.AerolineaTabla;
import uni.edu.pe.dto.VueloTabla;
import uni.edu.pe.dto.ReporteTabla;

public interface TablaDao {
	List<ReporteTabla> obtenerReporte();
    AerolineaTabla insertarAerolineaDeTabla(AerolineaTabla aerolineaTabla);
    VueloTabla actualizarVueloTabla(VueloTabla vueloTabla);
}
