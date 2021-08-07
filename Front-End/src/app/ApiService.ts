import {HttpClient, HttpHeaders} from "@angular/common/http";
import { Injectable } from "@angular/core";
import {Observable, throwError} from "rxjs";

import {catchError, retry} from "rxjs/operators";
import {VueloTabla,  RespuestaDelReporteTabla} from "./interfaces";


@Injectable({providedIn: 'root'})
export class ApiService {
  httpOptions = {headers: new HttpHeaders({'Content-Type': 'application/json;charset=utf-8'})};

  constructor(private http: HttpClient) {
  }

  errorHandl(error: any) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      errorMessage = error.error.message;
    } else {
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(errorMessage);
  }

  obtenerReporte():Observable<RespuestaDelReporteTabla>{
    return this.http.post<RespuestaDelReporteTabla>("http://localhost:8080/obtenerReporte", null,this.httpOptions )
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }

  actualizarDetalleTabla(data: VueloTabla):Observable<VueloTabla>{
    return this.http.post<VueloTabla>("http://localhost:8080/actualizarDetalleTabla", data,this.httpOptions )
      .pipe(
        retry(1),
        catchError(this.errorHandl)
      );
  }
}
