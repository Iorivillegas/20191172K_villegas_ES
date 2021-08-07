package uni.edu.pe.dto;

import lombok.Data;

@Data
public class TramoTabla {
	private int id_escala ;
	private int id_vuelo ;
	private String aeropuerto_llegada ;
	private String aeropuerto_salida;
	private String fecha_llegada;
	private String fecha_salida ;
	private String hora_llegada;
	private String hora_salida;
	
	
	public int getId_vuelo() {
		return id_vuelo;
	}


	public void setId_vuelo(int id_vuelo) {
		this.id_vuelo = id_vuelo;
	}


	public String getAeropuerto_llegada() {
		return aeropuerto_llegada;
	}


	public void setAeropuerto_llegada(String aeropuerto_llegada) {
		this.aeropuerto_llegada = aeropuerto_llegada;
	}


	public String getAeropuerto_salida() {
		return aeropuerto_salida;
	}


	public void setAeropuerto_salida(String aeropuerto_salida) {
		this.aeropuerto_salida = aeropuerto_salida;
	}


	public String getFecha_llegada() {
		return fecha_llegada;
	}


	public void setFecha_llegada(String fecha_llegada) {
		this.fecha_llegada = fecha_llegada;
	}


	public String getFecha_salida() {
		return fecha_salida;
	}


	public void setFecha_salida(String fecha_salida) {
		this.fecha_salida = fecha_salida;
	}


	public String getHora_llegada() {
		return hora_llegada;
	}


	public void setHora_llegada(String hora_llegada) {
		this.hora_llegada = hora_llegada;
	}


	public String getHora_salida() {
		return hora_salida;
	}


	public void setHora_salida(String hora_salida) {
		this.hora_salida = hora_salida;
	}

	public int getId_escala() {
		return id_escala;
	}


	public void setId_escala(int id_escala) {
		this.id_escala = id_escala;
	}
}
