import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Preguntas } from 'src/app/components/acerca-de/preguntas.interface';
@Injectable({
  providedIn: 'root'
})
export class AboutServiceService {

private preguntas : Preguntas[]=[
  { id: 1,respuesta:'Para facilitar el uso del pc'},
  {id:2,respuesta:`Desarroladores: Marco Lisandro, Franco //
   Juan Butista, Malina`}
]

  constructor() { }

  getAbout():Preguntas[]{
    return this.preguntas;
  }

}
