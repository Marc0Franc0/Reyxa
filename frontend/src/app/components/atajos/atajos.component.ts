
import { Component, OnInit } from '@angular/core';
import { HttpService } from 'src/app/services/http-service/http.service';
@Component({
  selector: 'atajos',
  templateUrl: './atajos.component.html',
  styleUrls: ['./atajos.component.scss']

})
export class AtajosComponent implements OnInit {
  respuesta ="";

  constructor(private httpservice:HttpService) { }

  ngOnInit(): void {


  }


  /*Cada uno de estos metodos son llamados en el template del componente,
   junto con el boton correspondiente y el evento (en este caso el evento es el click del mouse)*/
  abrirExplorador(){
this.httpservice.abrirExplorador();


/*Se utilizo este metodo de prueba para retornar un string por consola
,ya que al abrir un atajo o realizar una determinada tarea de Windows no estamos haciendolo y solo es a modo de prueba
*/

  }
  abrirWord(){
    this.httpservice.abrirWord();
      }
  abrirNotas(){
    this.httpservice.abrirNotas();
  }
  abrirPaint(){
    this.httpservice.abrirPaint();
  }
  abrirCalculadora(){

    this.httpservice.abrirCalculadora();
  }
  abrirWsp(){
this.httpservice.abrirWsp();
  }
  abrirSpotify(){
this.httpservice.abrirSpotify();
  }
  abrirIg(){
this.httpservice.abrirIg().subscribe(),
(error: any) => {
  console.log(error);
};
  }


  abrirYoutube(){
this.httpservice.abrirYoutube();
  }



  abrirGmail(){

    this.httpservice.abrirGmail();
  }
  abrirNoticias(){
this.httpservice.abrirNoticias();
  }
  abrirClima(){
this.httpservice.abrirClima();
  }
  abrirNetflix(){
this.httpservice.abrirNetflix();
  }
  abrirConfig(){this.httpservice.abrirConfig().subscribe(),
(error: any) => {
  console.log(error);
};
  }

}
