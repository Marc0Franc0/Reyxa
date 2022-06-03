import { Component, OnInit } from '@angular/core';
import { ConfigService } from 'src/app/config/config.service';
@Component({
  selector: 'atajos',
  templateUrl: './atajos.component.html',
  styleUrls: ['./atajos.component.scss']

})
export class AtajosComponent implements OnInit {

  constructor(private configs:ConfigService) { }

  ngOnInit(): void {
  }


  /*Cada uno de estos metodos son llamados en el template del componente,
   junto con el boton correspondiente y el evento (en este caso el evento es el click del mouse)*/
  abrirExplorador(){
this.configs.abrirExplorador();
  }
  abrirWord(){
    this.configs.abrirWord();
      }
  abrirNotas(){
    this.configs.abrirNotas();
  }
  abrirPaint(){
    this.configs.abrirPaint();
  }
  abrirCalculadora(){

    this.configs.abrirCalculadora();
  }
  abrirWsp(){
this.configs.abrirWsp();
  }
  abrirSpotify(){
this.configs.abrirSpotify();
  }
  abrirIg(){
this.configs.abrirIg();
  }


  abrirYoutube(){
this.configs.abrirYoutube();
  }



  abrirGmail(){

    this.configs.abrirGmail();
  }
  abrirNoticias(){
this.configs.abrirNoticias();
  }
  abrirClima(){
this.configs.abrirClima();
  }
  abrirNetflix(){
this.configs.abrirNetflix();
  }
  abrirConfig(){
this.configs.abrirConfig();
  }

}
