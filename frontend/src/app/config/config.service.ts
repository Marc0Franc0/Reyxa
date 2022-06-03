
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

abrirExplorador(){
  this.http
  .get('http://localhost:8080/explorer', { responseType: 'text' })
  .subscribe((resp: any) => {
    this.respuesta = resp;
  }),
  (error: any) => {
    console.log(error);
  };
}
abrirNotas(){
  this.http
  .get('http://localhost:8080/notepad', { responseType: 'text' })
  .subscribe((resp: any) => {
    this.respuesta = resp;
  }),
  (error: any) => {
    console.log(error);
  };
}
abrirPaint(){
  this.http
  .get('http://localhost:8080/paint', { responseType: 'text' })
  .subscribe((resp: any) => {
    this.respuesta = resp;
  }),
  (error: any) => {
    console.log(error);
  };
}
abrirCalculadora(){
  this.http
  .get('http://localhost:8080/calculadora', { responseType: 'text' })
  .subscribe((resp: any) => {
    this.respuesta = resp;
  }),
  (error: any) => {
    console.log(error);
  };
}
abrirWsp(){
  this.http
  .get('http://localhost:8080/wsp', { responseType: 'text' })
  .subscribe((resp: any) => {
    this.respuesta = resp;
  }),
  (error: any) => {
    console.log(error);
  };
}

abrirWord(){
  this.http
  .get('http://localhost:8080/word', { responseType: 'text' })
  .subscribe((resp: any) => {
    this.respuesta = resp;
  }),
  (error: any) => {
    console.log(error);
  };
}

abrirSpotify(){
  this.http
  .get('http://localhost:8080/spotify', { responseType: 'text' })
  .subscribe((resp: any) => {
    this.respuesta = resp;
  }),
  (error: any) => {
    console.log(error);
  };
}
abrirIg(){
  this.http
  .get('http://localhost:8080/ig', { responseType: 'text' })
  .subscribe((resp: any) => {
    this.respuesta = resp;
  }),
  (error: any) => {
    console.log(error);
  };
}
abrirYoutube(){
  this.http
  .get('http://localhost:8080/youtube', { responseType: 'text' })
  .subscribe((resp: any) => {
    this.respuesta = resp;
  }),
  (error: any) => {
    console.log(error);
  };
}
abrirGmail(){
  this.http
  .get('http://localhost:8080/gmail', { responseType: 'text' })
  .subscribe((resp: any) => {
    this.respuesta = resp;
  }),
  (error: any) => {
    console.log(error);
  };
}
abrirNoticias(){
  this.http
  .get('http://localhost:8080/noticias', { responseType: 'text' })
  .subscribe((resp: any) => {
    this.respuesta = resp;
  }),
  (error: any) => {
    console.log(error);
  };
}
abrirClima(){
  this.http
  .get('http://localhost:8080/clima', { responseType: 'text' })
  .subscribe((resp: any) => {
    this.respuesta = resp;
  }),
  (error: any) => {
    console.log(error);
  };
}
abrirNetflix(){
  this.http
  .get('http://localhost:8080/netflix', { responseType: 'text' })
  .subscribe((resp: any) => {
    this.respuesta = resp;
  }),
  (error: any) => {
    console.log(error);
  };
}
abrirConfig(){
  this.http
  .get('http://localhost:8080/Wconfig', { responseType: 'text' })
  .subscribe((resp: any) => {
    this.respuesta = resp;
  }),
  (error: any) => {
    console.log(error);
  };
}
}
