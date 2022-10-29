
import { RouterOutlet } from '@angular/router';
import { HttpService } from 'src/app/services/http-service/http.service';
import { Component } from '@angular/core';
import Swal from 'sweetalert2'
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent {
  constructor(private httpservice:HttpService)
  {}

  ngOnInit(){

  }





}
