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


}
