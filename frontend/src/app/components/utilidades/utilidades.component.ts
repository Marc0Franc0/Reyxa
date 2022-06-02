import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Component({
  selector: 'utilidades',
  templateUrl: './utilidades.component.html',
  styleUrls: ['./utilidades.component.scss']
})
export class UtilidadesComponent implements OnInit {

  constructor(private http:HttpClient ) { }

  ngOnInit(): void {
  }


vaciarPapelera(){
this.http.get("http://localhost:8080/papelera")

}

realizarAnalisis(){

}

abrirWupdate(){

}

programarApagado(){

}

}
