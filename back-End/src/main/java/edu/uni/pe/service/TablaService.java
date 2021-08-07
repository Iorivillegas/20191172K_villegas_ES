package edu.uni.pe.service;

import uni.edu.pe.dto.AerolineaTabla;
import uni.edu.pe.dto.ReporteTabla;
import uni.edu.pe.dto.VueloTabla;


import java.util.List;

public interface TablaService {
	List<ReporteTabla> obtenerReporte();
    AerolineaTabla insertarAerolineaDeTabla(AerolineaTabla aerolineaTabla);
    VueloTabla actualizarVueloTabla(VueloTabla vueloTabla);
}
