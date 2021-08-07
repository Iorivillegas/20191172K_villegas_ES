package edu.uni.pe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import edu.uni.pe.service.TablaService;
import uni.edu.pe.dto.AerolineaTabla;
import uni.edu.pe.dto.VueloTabla;
import uni.edu.pe.dto.rest.RespuestaDelReporteTabla;


@RestController
@CrossOrigin(origins = {"*"})
public class TablaController {

    @Autowired
    private TablaService service;

    @RequestMapping(
            value = "/obtenerReporte",
            method = RequestMethod.POST,
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody RespuestaDelReporteTabla obtenerReporte(){
        RespuestaDelReporteTabla rpta = new RespuestaDelReporteTabla();
        rpta.setReportes(service.obtenerReporte());
        return rpta;
    }

    @RequestMapping(
            value = "/insertarCatalogoDeTabla",
            method = RequestMethod.POST,
            consumes = "application/json;charset=utf-8",
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody AerolineaTabla insertarAerolineaDeTabla(@RequestBody AerolineaTabla aerolineaTabla){
        return service.insertarAerolineaDeTabla(aerolineaTabla);
    }

    @RequestMapping(
            value = "/actualizarDetalleTabla",
            method = RequestMethod.POST,
            consumes = "application/json;charset=utf-8",
            produces = "application/json;charset=utf-8"
    )
    public @ResponseBody VueloTabla actualizarVueloTabla(@RequestBody VueloTabla vueloTabla){
        return service.actualizarVueloTabla(vueloTabla);
    }
 
  
}
