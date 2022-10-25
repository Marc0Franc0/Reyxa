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
    return this.http.get('http://localhost:8080/explorer');
  }
  abrirNotas() {
   return this.http.get('http://localhost:8080/notepad')};

  abrirPaint() {
  return  this.http.get('http://localhost:8080/paint');
  }

  abrirCalculadora() {
    return  this.http.get('http://localhost:8080/calculadora');
  }
  abrirWsp() {
    return  this.http.get('http://localhost:8080/whatsapp')
      ;
  }


  abrirSpotify() {
    return  this.http.get('http://localhost:8080/spotify');
  }
  abrirIg() {
    return this.http.get('http://localhost:8080/instagram');
  }
  abrirYoutube() {
    return   this.http.get('http://localhost:8080/youtube');
  }
abrirGmail() {
  return this.http.get('http://localhost:8080/gmail')
     ;
  }
  abrirNoticias() {
    return   this.http.get('http://localhost:8080/noticias')
      ;
  }
  abrirClima() {
    return   this.http.get('http://localhost:8080/clima')
      ;
  }
  abrirNetflix() {
    return  this.http.get('http://localhost:8080/netflix')

      ;
  }
  abrirConfig() {
    return this.http.get('http://localhost:8080/wconfig');
  }

  vaciarPapelera() {
    return  this.http.get('http://localhost:8080/papelera')
  }

  realizarAnalisis() {
    return  this.http.get('http://localhost:8080/antivirus')
      ;
  }

  programarApagado(tiempo: number) {
    //this.http.post('http://localhost:8080/apagado',{ResponseType:Number}).subscribe();
    return  this.http
      .get('http://localhost:8080/progapagado', {
        params: {
          tiempo,
        },
      });
  }
  cancelarApagado() {
    return this.http.get('http://localhost:8080/cancapagado', {})
  }

  abrirWupdate() {
    return this.http.get('http://localhost:8080/wupdate')
      ;
  }
  crearUsuario(usuario: Usuario) {
    return this.http.post(`${this.path}/usuarionuevo`, {
      nombre: usuario.nombre,
      comentario_usuario: {
        comentario: usuario.comentario_usuario.comentario,
      },
    });
  }
  /*buscarOpinion(usuario:string){
 return this.http.get(`http://localhost:8080/buscaropinion`,{params: { usuario }});


}*/
  buscarUsuario(nombre: string) {
    return this.http.get('http://localhost:8080/buscarusuario', {
      params: {
        nombre,
      },
    });
  }
  buscarUsuarioById(id: number) {
    return this.http.get('http://localhost:8080/buscarusuariobyid', {
      params: {
        id,
      },
    });
  }
  eliminarOpinion(usuario: string) {
    return this.http.get(`${this.path}/eliminaropinion`, {
      params: {
        usuario,
      },
    });
  }

  buscarUsuarios(): Observable<Usuario[]> {
    return this.http.get<Usuario[]>(`http://localhost:8080/usuarios`);
  }
  editarUsuario(id: number, usuario: Usuario) {
    return this.http.put(
      `${this.path}/editarusuario/` + id,
      {
        nombre: usuario.nombre,
        comentario_usuario: {
          comentario: usuario.comentario_usuario.comentario,
        },
      },
      { responseType: 'text' }
    );
  }
}
