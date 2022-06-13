import { ConfigService } from './../../config/config.service';
import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2';

@Component({
  selector: 'utilidades',
  templateUrl: './utilidades.component.html',
  styleUrls: ['./utilidades.component.scss'],
})
export class UtilidadesComponent implements OnInit {
  respuesta = "";

  constructor(private configService: ConfigService) {}

  ngOnInit(): void {}

  vaciarPapelera() {
    Swal.fire({
      title: '¿Desea vaciar la papelera?',
      showDenyButton: true,
      showCancelButton: true,
      position: 'top',
      confirmButtonText: 'Vaciar papalera',
      denyButtonText: `No vaciar papelera`,
    }).then((result) => {
      /* Read more about isConfirmed, isDenied below */
      if (result.isConfirmed) {
        Swal.fire('Se vació la papelera con éxito!', '', 'success'),
          this.configService.vaciarPapelera();
      } else if (result.isDenied) {
        Swal.fire('No se vació la papelera', '', 'info');
      }
    });
  }

  realizarAnalisis() {

    Swal.fire({
      title: '¿Desea realizar un análisis con Windows defender?',
      showDenyButton: true,
      showCancelButton: true,
      position: 'top',
      confirmButtonText: 'Realizar análisis',
      denyButtonText: `No realizar análisis`,
    }).then((result) => {
      /* Read more about isConfirmed, isDenied below */
      if (result.isConfirmed) {
        const Toast = Swal.mixin({
          toast: true,
          position: 'top',
          showConfirmButton: false,
          timer: 7000,
          timerProgressBar: true,
          didOpen: (toast) => {
            toast.addEventListener('mouseenter', Swal.stopTimer);
            toast.addEventListener('mouseleave', Swal.resumeTimer);

          },

        });


        this.configService.realizarAnalisis();

        Toast.fire({
          title: 'Realizando análisis con Windows defender',
        });
      } else if (result.isDenied) {
        Swal.fire('No se realizo el análisis', '', 'info');
      }
    });


  }
  abrirWupdate(){

    this.configService.abrirWupdate();
  }

  llevarTiempo(tiempo:3600){

  }

  programarApagado(tiempo:number){



    this.configService.programarApagado(tiempo);
    tiempohs : Number
    tiempohs : tiempo/3600;



    Swal.fire({
      position: 'top',
      icon: 'success',
      title: 'Se programo el pagado de '+ tiempo +'hs',
      showConfirmButton: false,
      timer: 1500
    })

  }

  cancelarApagado(){
this.configService.cancelarApagado();
  }

}
