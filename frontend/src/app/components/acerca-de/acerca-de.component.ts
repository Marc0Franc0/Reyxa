import { Comentario } from './../../model/Comentario';


import { Observable } from 'rxjs';
import { HttpService } from 'src/app/services/http-service/http.service';

import { Usuario } from '../../model/Usuario';

import { Component, Input, OnInit } from '@angular/core';
import { FormGroup,Validators,FormControl } from '@angular/forms';
import { identifierName, R3TargetBinder, ThisReceiver } from '@angular/compiler';
import Swal, { SweetAlertIcon } from 'sweetalert2';


@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.scss']
})
export class AcercaDeComponent implements OnInit {
  constructor(private http:HttpService ) { }

//Objeto de tipo Usuario utilizado cuando el usuario busca uno para editar y si se encuenbtra un usuario lo almacena dentro de este mismo
  usuario:Usuario = new Usuario();

//Objeto utilizado para guardar el usuario que se ingresa al completar el formulario que permite crear un usuario
usuariocrear:Usuario=new Usuario();

//Array de tipo Usuario utilizado para mostrar en la tabla de todos los comentarios de los usuarios
  usuarios: Usuario[] = [];

//Nombre que el usuario ingresa para editar un comentario pero que previamente debe ser buscado
nombre_usuario:string="";

//Respuesta desde el servidor de tipo string que muestra si encontro o no un comentario de el usuario buscadp
 rta:string|undefined;


  ngOnInit(): void {
    /*Se buscam todos los usuarios al cargar el componente  */
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
  this.nombre_usuario="";
}else{
this.rta = "No se encontro un comentario del usuario"+this.usuario.nombre;
this.usuario.nombre="";
  this.usuario.comentario_usuario.comentario="";
}


  //this.usuario=JSON.stringify(dato);
    });



  }
  buscarUsuarios(){
    this.usuario.id_usuario=0;
    this.http.buscarUsuarios().subscribe(dato => {
         console.log(dato);
     this.usuarios=dato;
       }
    )


     }



  crearUsuario(){
    if(this.usuariocrear.nombre==""||this.usuariocrear.comentario_usuario.comentario==""){
      Swal.fire({


        position: 'top',
        icon: 'info',
        title: 'El usuario o comentario estan vacios',
        timer: undefined

      })
    }else{
    let  icono:SweetAlertIcon;
      this.http.crearUsuario(this.usuariocrear).subscribe(
        (data) => {
          console.log(data);
        },(rta) => {
          let dato:string=rta.error.text;
          if(dato=="Ya existe un comentario de ese usuario"){
            icono='error';
          }else{
            icono='success';
          }
          Swal.fire({


            position: 'top',
            icon: icono,
            title: rta.error.text,
            timer: undefined

          })
      })

    }





}

editarUsuario(){

let id:Number

this.http.editarUsuario(this.usuario.id_usuario,this.usuario).subscribe(dato=>{
  let icono:SweetAlertIcon|undefined;

if(dato=='Se realizaron los cambios correctamente'){
icono="success";
}else if(dato=='No se encontro un usuario anteriormente por lo que no se puede editar'){
icono="error";
}else{

  icono="info";
}


  Swal.fire({


    position: 'top',
    icon: icono,
    title: dato,
    timer: undefined


  })
}
  );

}
}
