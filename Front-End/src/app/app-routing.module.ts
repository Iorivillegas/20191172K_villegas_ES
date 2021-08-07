import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ReporteTablasComponent} from "./reporte/reporte.component";
import {ActualizarDetalleComponent} from "./actualizar/actualizar.component";

const routes: Routes = [
  {path:"reporteTablas", component: ReporteTablasComponent},
  {path: "actualizar", component: ActualizarDetalleComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
