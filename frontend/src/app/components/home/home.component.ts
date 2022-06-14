
import { Component, OnInit } from '@angular/core';
import { HttpService } from 'src/app/services/http-service/http.service';
import { trigger,state,style,animate,transition,query,animateChild,group,animation } from '@angular/animations';
import { RouterOutlet } from '@angular/router';
@Component({

  selector: 'home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.scss'],
  animations:[
    trigger('routeAnimations', [
      transition('HomePage <=> AboutPage', [
        style({ position: 'relative' }),
        query(':enter, :leave', [
          style({
            position: 'absolute',
            top: 0,
            left: 0,
            width: '100%'
          })
        ]),
        query(':enter', [
          style({ left: '-100%' })
        ]),
        query(':leave', animateChild()),
        group([
          query(':leave', [
            animate('300ms ease-out', style({ left: '100%' }))
          ]),
          query(':enter', [
            animate('300ms ease-out', style({ left: '0%' }))
          ])
        ]),
        query(':enter', animateChild()),
      ]),
      transition('* <=> FilterPage', [
        style({ position: 'relative' }),
        query(':enter, :leave', [
          style({
            position: 'absolute',
            top: 0,
            left: 0,
            width: '100%'
          })
        ]),
        query(':enter', [
          style({ left: '-100%' })
        ]),
        query(':leave', animateChild()),
        group([
          query(':leave', [
            animate('200ms ease-out', style({ left: '100%' }))
          ]),
          query(':enter', [
            animate('300ms ease-out', style({ left: '0%' }))
          ])
        ]),
        query(':enter', animateChild()),
      ])
    ]),
trigger('transicion', [

  state('inactive',style({

    backgroundcolor: '#ffffff',

  })),

  state('active',style({

    backgroundColor : '#ff0000',
transform:'scale(1.2)'
  })),
  transition('inactive => active',animate('100ms ease-in')),
  transition('active => inactive',animate('100ms ease-out'))
])
  ]

})
export class HomeComponent implements OnInit {

  public state:string = "inactive";
  constructor(private httpService:HttpService) { }

  ngOnInit(): void {
  }

  cerrarPrograma(){

      if (this.state === 'inactive') {
        this.state = 'active';
      } else {
        this.state  = 'inactive';
      }

  }

}
