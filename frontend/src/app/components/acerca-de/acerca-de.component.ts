import { Comentario } from './../../model/Comentario';


import { Observable } from 'rxjs';
import { HttpService } from 'src/app/services/http-service/http.service';

import { Usuario } from '../../model/Usuario';

import { Component, OnInit } from '@angular/core';
import { FormGroup,Validators,FormControl } from '@angular/forms';
import { identifierName, R3TargetBinder, ThisReceiver } from '@angular/compiler';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.scss']
})
export class AcercaDeComponent implements OnInit {
  constructor(private http:HttpService ) { }
  usuario:Usuario = new Usuario();
usuarioeditar:Usuario=new Usuario();
  usuarios: Usuario[] = [];
nombre_usuario:string="";
 comentarioencontrado:string="";
 rta:string|undefined;
  ngOnInit(): void {
    this.http.buscarUsuarios().subscribe(data=>{
      this.usuarios=data;
      console.log(this.usuarios)
    })
  //this.buscarUsuarios();

  }


buscarComentarios():any{
  this.http.buscarUsuarios().subscribe(data=>{
    this.usuarios=data;
  })


}

  buscarUsuario(){
 this.http.buscarUsuario(this.nombre_usuario).subscribe(dato => {
      //console.log(dato);

if(dato==null){
  console.log("No hay un comentario de ese usuario")
  this.usuario.nombre="";
  this.usuario.comentario_usuario.comentario="";
}else
{
 this.usuario= <Usuario> dato;
 console.log(this.usuario);


}

if(this.usuario.comentario_usuario.comentario!=''){

  this.rta= "Comentario encontrado";
}else{
this.rta = "No se encontro un comentario del usuario"+this.usuario.nombre;

}


  //this.usuario=JSON.stringify(dato);
    },rta => {console.log(rta.error.text);
      //Swal.fire(rta.error.text)
      Swal.fire({


        position: 'top',
        icon: 'info',
        title: rta.error.text,
        timer: undefined


      })
    });



  }
  buscarUsuarios(){
    this.http.buscarUsuarios().subscribe(dato => {
         console.log(dato);
     this.usuarios=dato;
       }
    )


     }



  crearUsuario(){
  console.log(this.usuario);
 this.http.crearUsuario(this.usuario).subscribe(
    (data) => {
      console.log(data);
    },(rta) => {
      console.log(rta.error.text);
      //Swal.fire(rta.error.text)
      Swal.fire({


        position: 'top',
        icon: 'info',
        title: rta.error.text,
        timer: undefined

      })
  })



}

editarUsuario(){

let id:Number
this.http.editarUsuario(this.usuario.id_usuario,this.usuario).subscribe(dato=>{

  console.log(dato);
}
  );

}
}
