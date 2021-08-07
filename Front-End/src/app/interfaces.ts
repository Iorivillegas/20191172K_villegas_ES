export interface ReporteTabla{
    
    codigo_vuelo: String  ;
	codigo_origen: String ;
	codigo_destino: String ;
	costo: number  ;
	nombre_aerolinea: String  ;
	codigo_aerolinea: String ;
	tipo_vuelo: String ;
	estado: String ;
	aeropuerto_llegada: String  ;
	aeropuerto_salida: String ;
	fecha_llegada: String ;
	hora_llegada: String ;
	fecha_salida: String  ;
	hora_salida: String ;
  }
  
  export interface RespuestaDelReporteTabla{
    reportes:ReporteTabla[];
  }
  
  export interface VueloTabla {
    id_vuelo: number;
    id_aerolinea: number;
    codigo_vuelo: string;
    ciudad_origen: string;
    ciudad_destino: string;
    costo: string;
    tipo_vuelo: number;
    estado: string;
  }
  