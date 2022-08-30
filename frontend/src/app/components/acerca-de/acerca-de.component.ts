import { Opinion } from './../../model/Opinion';

import { Observable } from 'rxjs';
import { HttpService } from 'src/app/services/http-service/http.service';



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
  opinion:Opinion = new Opinion();
usuario:string="";
  ngOnInit(): void {
    console.log(this.opinion);

  }



  buscarOpinion(){



return this.http.buscarOpinion(this.usuario).subscribe(dato => {
      console.log(dato);
  //this.usuario=JSON.stringify(dato);
    },error => console.log(error.error.text))


  }



 crearOpinion(){
  console.log(this.opinion);
  this.http.crearOpinion(this.opinion).subscribe(
    (data) => {
      console.log(data);
    },(error) => {
      console.log(error);
      ;
  })

 /*crearOpinion2(form:Opinion){

  this.http.crearOpinion(form).subscribe(dato =>console.log(dato));

 }*/


}
}
