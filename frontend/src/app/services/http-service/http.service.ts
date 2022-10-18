
import { Usuario } from '../../model/Usuario';
import { Observable } from 'rxjs';

import {
  HttpClient,
  HttpHeaderResponse,
  HttpHeaders,
  HttpParams,
} from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root',
})
export class HttpService {
  private path = 'http://localhost:8080';
  respuesta = '';

  constructor(private http: HttpClient) {}

  //opinion:Opinion=new Opinion();

  abrirExplorador() {
    this.http.get('http://localhost:8080/explorer').subscribe(),
      (error: any) => {
        console.log(error);
      };
  }
  abrirNotas() {
    this.http.get('http://localhost:8080/notepad').subscribe(),
      (error: any) => {
        console.log(error);
      };
  }
  abrirPaint() {
    this.http.get('http://localhost:8080/paint').subscribe(),
      (error: any) => {
        console.log(error);
      };
  }
  abrirCalculadora() {
    this.http.get('http://localhost:8080/calculadora').subscribe(),
      (error: any) => {
        console.log(error);
      };
  }
  abrirWsp() {
    this.http.get('http://localhost:8080/whatsapp').subscribe(),
      (error: any) => {
        console.log(error);
      };
  }

  abrirWord() {
    this.http.get('http://localhost:8080/word').subscribe(),
      (error: any) => {
        console.log(error);
      };
  }

  abrirSpotify() {
    this.http.get('http://localhost:8080/spotify').subscribe(),
      (error: any) => {
        console.log(error);
      };
  }
  abrirIg() {
    return this.http.get('http://localhost:8080/instagram');
  }
  abrirYoutube() {
    this.http.get('http://localhost:8080/youtube').subscribe(),
      (error: any) => {
        console.log(error);
      };
  }
  abrirGmail() {
    this.http.get('http://localhost:8080/gmail').subscribe(),
      (error: any) => {
        console.log(error);
      };
  }
  abrirNoticias() {
    this.http.get('http://localhost:8080/noticias').subscribe(),
      (error: any) => {
        console.log(error);
      };
  }
  abrirClima() {
    this.http.get('http://localhost:8080/clima').subscribe(),
      (error: any) => {
        console.log(error);
      };
  }
  abrirNetflix() {
    this.http.get('http://localhost:8080/netflix').subscribe(),
      (error: any) => {
        console.log(error);
      };
  }
  abrirConfig() {
    return this.http.get('http://localhost:8080/wconfig');
  }

  /*seabrioexplorer() {
    return this.http.get('http://localhost:8080/explorerConsole', {
      responseType: 'text',
    });
  }*/

  vaciarPapelera() {
    this.http.get('http://localhost:8080/papelera').subscribe(),
      (error: any) => {
        console.log(error);
      };
  }

  realizarAnalisis() {
    this.http.get('http://localhost:8080/antivirus').subscribe(),
      (error: any) => {
        console.log(error);
      };
  }

  /*programarApagado(){

  this.http
  .get('http://localhost:8080/apagado')
  .subscribe(),
  (error: any) => {
    console.log(error);
  };


};*/

  programarApagado(tiempo: number) {
    //this.http.post('http://localhost:8080/apagado',{ResponseType:Number}).subscribe();
    this.http
      .get('http://localhost:8080/progapagado', {
        params: {
          tiempo,
        },
      })
      .subscribe();
  }
  cancelarApagado() {
    this.http.get('http://localhost:8080/cancapagado', {}).subscribe();
  }

  abrirWupdate() {
    this.http.get('http://localhost:8080/wupdate').subscribe(),
      (error: any) => {
        console.log(error);
      };
  }
  crearUsuario(usuario:Usuario) {
    return this.http.post(`${this.path}/usuarionuevo`,
    {"id_usuario":null,"nombre":usuario.nombre,"comentario_usuario":{"id_comentario":null,"comentario":usuario.comentario}});
  }
  /*buscarOpinion(usuario:string){
 return this.http.get(`http://localhost:8080/buscaropinion`,{params: { usuario }});


}*/
  buscarUsuario(nombre:string) {
    return this.http
      .get('http://localhost:8080/buscarusuario', {
        params: {
          nombre,
        },
      })


  }
  eliminarOpinion(usuario:string){
    return this.http
    .get(`${this.path}/eliminaropinion`, {
      params: {
        usuario,
      },
    })

  }

buscarUsuarios(){
  return this.http.get<Usuario[]>(`http://localhost:8080/usuarios`);

 }


}
