import { HttpService } from '../../services/http-service/http.service';
import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2';

@Component({
  selector: 'utilidades',
  templateUrl: './utilidades.component.html',
  styleUrls: ['./utilidades.component.scss'],
})

  /*
  -Cada uno de estos metodos son llamados en el template del componente,
   junto con el boton correspondiente y el evento (en este caso el evento es el click del mouse)
  - Los mismos utilizan un objeto creado de tipo HttpService el cual es el servicio creado en services
  -Se utilizo la libreria externa SweetAlert para mostrar al usuario diferentes alertas
   */
export class UtilidadesComponent implements OnInit {


  constructor(private httpService: HttpService) {}

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

      if (result.isConfirmed) {
        Swal.fire({


          position: 'top',
          icon: 'success',
          title: 'Se vació la papelera con éxito',
          showConfirmButton: false,
          timer: 2200

        }),
        //Llamado al metodo correspondiente del servicio
          this.httpService.vaciarPapelera().subscribe();
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

      if (result.isConfirmed) {

        let timerInterval
        Swal.fire({

          title: 'Realizando análisis con Windows Defender',

          position: 'top',
          timer: 9000,
          timerProgressBar: true,
          didOpen: () => {

            Swal.showLoading()
            timerInterval = setInterval(() => {

            }, 100),
            //Llamado al metodo correspondiente del servicio
            this.httpService.realizarAnalisis().subscribe();
          },
          willClose: () => {

          }
        }).then((result) => {

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

    this.httpService.abrirWupdate().subscribe();
  }



  programarApagado(tiempo:number){



    this.httpService.programarApagado(tiempo).subscribe();


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

this.httpService.cancelarApagado().subscribe();
Swal.fire({


  position: 'top',
  icon: 'success',
  title: 'Se cancelo el apagado programado anteriormente',
  showConfirmButton: false,
  timer: 2500
})

  }

}
