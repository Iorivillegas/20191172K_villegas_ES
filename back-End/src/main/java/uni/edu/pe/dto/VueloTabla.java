package uni.edu.pe.dto;

import lombok.Data;

@Data
public class VueloTabla {
	private int id_vuelo ;
	private int id_aerolinea ;
	private String codigo_vuelo ;
	private String ciudad_origen;
	private String ciudad_destino;
	private int costo ;
	private String tipo_vuelo;
	private String estado;
	
	public int getId_vuelo() {
		return id_vuelo;
	}
	public void setId_vuelo(int id_vuelo) {
		this.id_vuelo = id_vuelo;
	}
	public int getId_aerolinea() {
		return id_aerolinea;
	}
	public void setId_aerolinea(int id_aerolinea) {
		this.id_aerolinea = id_aerolinea;
	}
	public String getCodigo_vuelo() {
		return codigo_vuelo;
	}
	public void setCodigo_vuelo(String codigo_vuelo) {
		this.codigo_vuelo = codigo_vuelo;
	}
	
	public String getCiudad_destino() {
		return ciudad_destino;
	}
	public void setCiudad_destino(String ciudad_destino) {
		this.ciudad_destino = ciudad_destino;
	}

	public int getCosto() {
		return costo;
	}
	public void setCosto(int costo) {
		this.costo = costo;
	}
	public String getTipo_vuelo() {
		return tipo_vuelo;
	}
	public void setTipo_vuelo(String tipo_vuelo) {
		this.tipo_vuelo = tipo_vuelo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCiudad_origen() {
		return ciudad_origen;
	}
	public void setCiudad_origen(String ciudad_origen) {
		this.ciudad_origen = ciudad_origen;
	}
	
}
