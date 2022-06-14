


import { Component, OnInit } from '@angular/core';
import { AboutServiceService } from 'src/app/services/about-service/about.service.service';
import { Preguntas } from './preguntas.interface';
@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.scss']
})
export class AcercaDeComponent implements OnInit {

  public selectedpreguntas : Preguntas= { id : 0 , respuesta:''};

  public preguntas:Preguntas[];


  constructor(private about: AboutServiceService) { this.preguntas= this.about.getAbout();}

  ngOnInit(): void {
console.log(this.preguntas);
  }


}
