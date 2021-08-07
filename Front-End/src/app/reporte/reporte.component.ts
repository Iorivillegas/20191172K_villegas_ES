import { Component, OnInit } from '@angular/core';
import {ApiService} from "../../ApiService";
import {ReporteTabla} from "../../interfaces";

@Component({
  selector: 'app-reporte',
  templateUrl: './reporte.component.html',
  styleUrls: ['./reporte.component.scss']
})
export class ReporteTablasComponent implements OnInit {
  lista: ReporteTabla[] = [];
  constructor(private api: ApiService) { }

  ngOnInit(): void {
    this.api.obtenerReporte().subscribe((data: { reportes: any[]; }) =>{
        this.lista = data.reportes;
      }
    )
  }
}