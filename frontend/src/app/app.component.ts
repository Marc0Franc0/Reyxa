import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

hola='';

  constructor( private http: HttpClient){

}

ngOnInit(){

  this.http.get("http://localhost:8080/hola"),{responseType: 'string'}
}



}
