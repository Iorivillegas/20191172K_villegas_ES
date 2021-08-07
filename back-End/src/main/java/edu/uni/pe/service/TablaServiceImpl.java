package edu.uni.pe.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.uni.pe.dao.TablaDao;
import uni.edu.pe.dto.AerolineaTabla;
import uni.edu.pe.dto.ReporteTabla;
import uni.edu.pe.dto.VueloTabla;



import java.util.List;

@Service
public class TablaServiceImpl implements TablaService{

    @Autowired
    private TablaDao dao;

    @Override
    public List<ReporteTabla> obtenerReporte() {
        return dao.obtenerReporte();
    }

    @Override
    public AerolineaTabla insertarAerolineaDeTabla(AerolineaTabla aerolineaTabla){
        return dao.insertarAerolineaDeTabla(aerolineaTabla);
    }

    @Override
    public VueloTabla actualizarVueloTabla(VueloTabla vueloTabla){
        return dao.actualizarVueloTabla(vueloTabla);
    }
    
    
}
