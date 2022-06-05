import { Component, OnInit } from '@angular/core';
import { ConfigService } from 'src/app/config/config.service';
@Component({
  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss']
})
export class HomeComponent implements OnInit {

  constructor(private configs:ConfigService) { }

  ngOnInit(): void {
  }

  cerrarPrograma(){
    //String
 var string = new String('Salir del programa');
 //Array de Strings
 //var array = new Array('HOLA','CHAU','HOLA','CHAU');
 //Array de nums
 //var array2 = new Array(1,2,3,4);

 console.log(string);
 //console.log(array);
 //console.log(array2);
  }


}
