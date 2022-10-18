

import { Observable } from 'rxjs';
import { HttpService } from 'src/app/services/http-service/http.service';

import { Usuario } from '../../model/Usuario';

import { Component, OnInit } from '@angular/core';
import { FormGroup,Validators,FormControl } from '@angular/forms';
import { ThisReceiver } from '@angular/compiler';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.scss']
})
export class AcercaDeComponent implements OnInit {
  constructor(private http:HttpService ) { }
  usuario:Usuario = new Usuario();

usuarios:Usuario[]=[];
nombre_usuario:string="";
  ngOnInit(): void {
    console.log(this.usuario);

  }




  buscarUsuario(){
 this.http.buscarUsuario(this.nombre_usuario).subscribe(dato => {
      console.log(dato);
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

}
