
import { Usuario } from './../../model/Usuario';
import { Observable } from 'rxjs';
import { HttpService } from 'src/app/services/http-service/http.service';



import { Component, OnInit } from '@angular/core';
import { Opinion } from 'src/app/model/Opinion';
import { FormGroup,Validators,FormControl } from '@angular/forms';
import { ThisReceiver } from '@angular/compiler';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.scss']
})
export class AcercaDeComponent implements OnInit {
opinion : Opinion = new Opinion();
//usuario : Usuario = new Usuario();
  constructor(private http:HttpService ) { }

  ngOnInit(): void {
console.log(this.opinion);
  }

  enviarOpinion(){



  }
  registro(form:Opinion){


  }

  buscarOpinion(){

  //this.opinion=
 this.http.buscarOpinion().subscribe(opinion=>console.log(opinion));


  }

 crearOpinion(opinion:Opinion){

 }

}
