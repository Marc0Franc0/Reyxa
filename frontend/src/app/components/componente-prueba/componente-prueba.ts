import { Component } from '@angular/core'

@Component({

  /*El selector va a servir para invocar
  al componente */
  selector: 'componente-prueba',

  /*Contenido del componente
  template: `<p>{{titulo}}</p>,
  <p>{{}anio}</p>
  `*/


  //Contenido del componente separado
  templateUrl:'./componente-prueba.component.html',


})

/*declaracion del nombre de la clase
que contiene el componente de prueba*/
export class ComponentePrueba {

  /*Declaración de una de las propiedades
  del componente
  */
  public titulo : String;
public anio : number;
  constructor() {
    console.log('Componente de prueba cargado');
    this.titulo = "Este es un componente de prueba";
    this.anio = 2022;
  }

}
