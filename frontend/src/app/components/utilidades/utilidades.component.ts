import { ConfigService } from './../../config/config.service';
import { Component, OnInit } from '@angular/core';
import { switchAll } from 'rxjs';
import Swal from 'sweetalert2';
@Component({
  selector: 'utilidades',
  templateUrl: './utilidades.component.html',
  styleUrls: ['./utilidades.component.scss']
})
export class UtilidadesComponent implements OnInit {
  respuesta = "";


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



}
mostrarDescripcionApagado(){


}

vaciarPapelera(){
  Swal.fire({
    title: '¿Desea vaciar la papelera?',
    showDenyButton: true,
    showCancelButton: true,
    confirmButtonText: 'Vaciar papalera',
    denyButtonText: `No vaciar papelera`,
  }).then((result) => {
    /* Read more about isConfirmed, isDenied below */
    if (result.isConfirmed) {
      Swal.fire('Se vació la papelera con éxito!', '', 'success'),
      this.configService.vaciarPapelera();
    } else if (result.isDenied) {
      Swal.fire('No se vació la papelera', '', 'info')
    }
  })

}

realizarAnalisis(){
  this.configService.realizarAnalisis();
  alert('Realizando analisis con Windows defender');
}

}
