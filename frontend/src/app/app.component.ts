import { Component } from '@angular/core';
import { observable } from 'rxjs';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'frontend';

  //esta url abre el explorador:
  private explorerURL ="http://localhost:8080/explorer";

  /*constructor(private httpClient: HttpClient){
    abrirExplorador():Observable{return this.httpClient.get}
  }*/

}
