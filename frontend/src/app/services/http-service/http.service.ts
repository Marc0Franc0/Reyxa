
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


  constructor(private http: HttpClient) {}


  abrirExplorador() {
    return this.http.get(`${this.path}/explorer`);
  }

  abrirNotas() {
    return this.http.get(`${this.path}/notepad`)
  }


  abrirPaint() {
    return this.http.get(`${this.path}/paint`)
  }
  abrirCalculadora() {
    return this.http.get(`${this.path}/calculadora`)
  }
  abrirWsp() {
    return this.http.get(`${this.path}/whatsapp`);
  }


  abrirSpotify() {
    return this.http.get(`${this.path}/spotify`)
  }

  abrirIg() {
    return this.http.get(`${this.path}/instagram`);
  }
  abrirYoutube() {
    return this.http.get(`${this.path}/youtube`)
  }
  abrirGmail() {
    return this.http.get(`${this.path}/gmail`)
  }
  abrirNoticias() {
    return this.http.get(`${this.path}/noticias`)
  }


  abrirClima() {
    return this.http.get(`${this.path}/clima`)
  }


  abrirNetflix() {
    return this.http.get(`${this.path}/netflix`)
  }


  abrirConfig() {
    return this.http.get(`${this.path}/wconfig`);
  }


  vaciarPapelera() {
    return this.http.get(`${this.path}/papelera`)
  }

  realizarAnalisis() {
    return this.http.get(`${this.path}/antivirus`)
  }

  programarApagado(tiempo: number) {
    return this.http
      .get(`${this.path}/progapagado`, {
        params: {
          tiempo,
        },
      })

  }
  cancelarApagado() {
    return this.http.get(`${this.path}/cancapagado`, {});
  }

  abrirWupdate() {
    return this.http.get(`${this.path}/wupdate`)
  }
  crearUsuario(usuario:Usuario) {
    return this.http.post(`${this.path}/usuarionuevo`,
    {
      "nombre": usuario.nombre,
      "comentario_usuario": {
          "comentario": usuario.comentario_usuario.comentario

  }});
  }

  buscarUsuario(nombre:string) {
    return this.http
      .get(`${this.path}/buscarusuario`, {
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

buscarUsuarios():Observable<Usuario[]>{
  return this.http.get<Usuario[]>(`${this.path}/usuarios`);

 }
 editarUsuario(id:number,usuario:Usuario) {
  return this.http.put(`${this.path}/editarusuario/`+id,
  {
    "nombre": usuario.nombre,
    "comentario_usuario": {
        "comentario": usuario.comentario_usuario.comentario

}},{responseType: 'text'});

}}
