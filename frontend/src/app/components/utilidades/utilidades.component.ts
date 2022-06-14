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
      position: 'center',
      confirmButtonText: 'Vaciar papalera',
      denyButtonText: `No vaciar papelera`,
    }).then((result) => {
      /* Read more about isConfirmed, isDenied below */
      if (result.isConfirmed) {
        Swal.fire({


          position: 'top',
          icon: 'success',
          title: 'Se vació la papelera con éxito',
          showConfirmButton: false,
          timer: 2200

        }),
          this.configService.vaciarPapelera();
      } else if (result.isDenied) {
        Swal.fire({


          position: 'top',
          icon: 'info',
          title: 'No se vació la papelera',
          showConfirmButton: false,
          timer: 2200

        })
      }
    });
  }

  realizarAnalisis() {

    Swal.fire({
      title: '¿Desea realizar un análisis con Windows defender?',
      showDenyButton: true,
      showCancelButton: true,
      position: 'center',
      confirmButtonText: 'Realizar análisis',
      denyButtonText: `No realizar análisis`,
    }).then((result) => {
      /* Read more about isConfirmed, isDenied below */
      if (result.isConfirmed) {
        let timerInterval
        Swal.fire({
          title: 'Realizando análisis con Windows Defender',
          //html: 'I will close in <b></b> milliseconds.',
          position: 'top',
          timer: 9000,
          timerProgressBar: true,
          didOpen: () => {
            Swal.showLoading()
            timerInterval = setInterval(() => {

            }, 100)
          },
          willClose: () => {

          }
        }).then((result) => {
          /* Read more about handling dismissals below */
          if (result.dismiss === Swal.DismissReason.timer) {
            Swal.fire({


              position: 'top',
              icon: 'success',
              title: 'Se realizo el análisis correctamente',
              showConfirmButton: false,
              timer: 1500

            })
          }
        })} else if (result.isDenied) {
          Swal.fire({


            position: 'top',
            icon: 'info',
            title: 'No se realizo el análisis',
            showConfirmButton: false,
            timer: 2200

          })
      }
    });


  }

  abrirWupdate(){

    this.configService.abrirWupdate();
  }



  programarApagado(tiempo:number){



    this.configService.programarApagado(tiempo);


    let tiempohs= new Number(tiempo/3600);
    Swal.fire({


      position: 'top',
      icon: 'success',
      title: 'Se programo un apagado en '+ tiempohs +'hs',
      showConfirmButton: false,
      timer: 2500

    })


  }

  cancelarApagado(){

this.configService.cancelarApagado();
Swal.fire({


  position: 'top',
  icon: 'success',
  title: 'Se cancelo el apagado programado anteriormente',
  showConfirmButton: false,
  timer: 2500
})

  }

}
