import { Observable } from 'rxjs';

import { Component, OnInit } from '@angular/core';
import { HttpService } from 'src/app/services/http-service/http.service';
@Component({
  selector: 'atajos',
  templateUrl: './atajos.component.html',
  styleUrls: ['./atajos.component.scss'],
})
export class AtajosComponent implements OnInit {
  respuesta = '';

  constructor(private httpservice: HttpService) {}

  ngOnInit(): void {}

  /*Cada uno de estos metodos son llamados en el template del componente,
   junto con el boton correspondiente y el evento (en este caso el evento es el click del mouse)*/
  abrirExplorador() {
    this.httpservice.abrirExplorador().subscribe();

    /*Se utilizo este metodo de prueba para retornar un string por consola
,ya que al abrir un atajo o realizar una determinada tarea de Windows no estamos haciendolo y solo es a modo de prueba
*/
  }

  abrirNotas() {
    this.httpservice.abrirNotas().subscribe();
  }
  abrirPaint() {
    this.httpservice.abrirPaint().subscribe();
  }
  abrirCalculadora() {
    this.httpservice.abrirCalculadora().subscribe();
  }
  abrirWsp() {
    this.httpservice.abrirWsp().subscribe();
  }
  abrirSpotify() {
    this.httpservice.abrirSpotify().subscribe();
  }
  abrirIg() {
    this.httpservice.abrirIg().subscribe();
  }

  abrirYoutube() {
    this.httpservice.abrirYoutube().subscribe();
  }

  abrirGmail() {
    this.httpservice.abrirGmail().subscribe();
  }
  abrirNoticias() {
    this.httpservice.abrirNoticias().subscribe();
  }
  abrirClima() {
    this.httpservice.abrirClima().subscribe();
  }
  abrirNetflix() {
    this.httpservice.abrirNetflix().subscribe();
  }
  abrirConfig() {
    this.httpservice.abrirConfig().subscribe();
  }
}
