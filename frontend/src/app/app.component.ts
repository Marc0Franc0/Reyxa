import { ConfigService } from 'src/app/config/config.service';
import { Component } from '@angular/core';
import Swal from 'sweetalert2'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  title = 'Header 1, título de la página';
  unParrafo = 'Este es un párrafo de muestra.';
  respuesta = "";
  constructor(private configS:ConfigService)
  {}

  ngOnInit(){

    //this.configS.vaciarPapelera();
  }




}
