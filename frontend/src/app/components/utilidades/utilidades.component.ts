import { ConfigService } from './../../config/config.service';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'utilidades',
  templateUrl: './utilidades.component.html',
  styleUrls: ['./utilidades.component.scss']
})
export class UtilidadesComponent implements OnInit {
  respuesta = '';


  constructor(private configService:ConfigService) {
  }

  ngOnInit(): void {

  }

mostrarDescripcionPapepelera(){

  var descripcion = new String('Se abrirá la papelera de Windows.');
  console.log(descripcion);

}

mostrarDescripcionDefender(){

  var descripcion = new String('Se relizara un analisis con Windows Defender.');
  console.log(descripcion);

}

mostrarDescripcionWpdate(){

  var descripcion = new String('Se abrira Windows update para poder buscar actualizaciones.');
  console.log(descripcion);


}
mostrarDescripcionApagado(){


}

vaciarPapelera(){
  this.configService.vaciarPapelera();
}

realizarAnalisis(){
  this.configService.realizarAnalisis();
}

}
