
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class ConfigService {

respuesta = '';
  constructor(private http:HttpClient){

  }


vaciarPapelera(){
  this.http
  .get('http://localhost:8080/papelera', { responseType: 'text' })
  .subscribe((resp: any) => {
    this.respuesta = resp;
  }),
  (error: any) => {
    console.log(error);
  };
}
}
