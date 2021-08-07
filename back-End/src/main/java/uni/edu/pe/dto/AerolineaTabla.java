package uni.edu.pe.dto;

import lombok.Data;

@Data
public class AerolineaTabla {
	private int id_aerolinea ;
	private String nombre_aerolinea ;
	private String codigo_aerolinea;
	public int getId_aerolinea() {
		return id_aerolinea;
	}
	public void setId_aerolinea(int id_aerolinea) {
		this.id_aerolinea = id_aerolinea;
	}
	public String getNombre_aerolinea() {
		return nombre_aerolinea;
	}
	public void setNombre_aerolinea(String nombre_aerolinea) {
		this.nombre_aerolinea = nombre_aerolinea;
	}
	public String getCodigo_aerolinea() {
		return codigo_aerolinea;
	}
	public void setCodigo_aerolinea(String codigo_aerolinea) {
		this.codigo_aerolinea = codigo_aerolinea;
	}
	
	
}
