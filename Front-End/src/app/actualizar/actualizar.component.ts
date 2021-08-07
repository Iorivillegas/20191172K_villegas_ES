import { Component, OnInit } from '@angular/core';
import {CatalogoTabla, DetalleTabla} from "../../interfaces";
import {ApiService} from "../../ApiService";

@Component({
  selector: 'app-actualizar',
  templateUrl: './actualizar.component.html',
  styleUrls: ['./actualizar.component.scss']
})
export class ActualizarDetalleComponent implements OnInit {

  codigoTabla: string="";
  codigoDetalle: string="";
  valor: string="";
  descripcion: string="";
  mensaje: string = "";

  constructor(private api: ApiService) { }

  ngOnInit(): void {
  }

  actualizar(): void {
    console.log(this.codigoTabla);
    console.log(this.codigoDetalle);
    console.log(this.valor);
    console.log(this.descripcion);

    const detalleTabla: DetalleTabla = {
      id: 1,
      codigoTabla: this.codigoTabla,
      codigoDetalle: this.codigoDetalle,
      valor: this.valor,
      descripcion: this.descripcion,
      estado: '1'
    }

    this.api.actualizarDetalleTabla(detalleTabla).subscribe((retorno: { codigoTabla: string; codigoDetalle: string; valor: string; }) => {
      this.mensaje = "El detalle " + retorno.codigoTabla + "-"+retorno.codigoDetalle + " fue actualizado " +
        "correctamente al valor: "+retorno.valor;
      console.log(this.mensaje)
    })
  }

}

