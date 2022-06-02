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

  abrirExplorador(){
this.configs.abrirExplorador();
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
