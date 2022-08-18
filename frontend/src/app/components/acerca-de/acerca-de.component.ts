import { Observable } from 'rxjs';
import { HttpService } from 'src/app/services/http-service/http.service';



import { Component, OnInit } from '@angular/core';
import { Opinion } from 'src/app/model/Opinion';
import { FormGroup,Validators,FormControl } from '@angular/forms';
import { Usuario } from 'src/app/model/Usuario';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.scss']
})
export class AcercaDeComponent implements OnInit {
opinion : Opinion = new Opinion();
usuario : Usuario = new Usuario();
  constructor(private http:HttpService ) { }

  ngOnInit(): void {
console.log(this.usuario);
  }

  enviarOpinion(){



  }
  registro(form:Opinion){


  }

  buscarOpinion(){

 let opinion=  JSON.stringify(this.http.buscarOpinion(this.usuario.name));
this.usuario.opinion=opinion;
alert(this.usuario.opinion)

  }

 crearOpinion(opinion:Opinion){

 }

}
