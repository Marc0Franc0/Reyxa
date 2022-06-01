import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BackgroundComponent } from './components/background/background.component';
import { HomeComponent } from './components/home/home.component';
import { BackgroundDosComponent } from './components/background-dos/background-dos.component';
import { AtajosComponent } from './components/atajos/atajos.component';
import { Router, RouterModule, Routes } from '@angular/router';
import { UtilidadesComponent } from './components/utilidades/utilidades.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';

const routes: Routes = [
  {path: 'home',component: HomeComponent},{
  path:'atajos',component:AtajosComponent},
{path:'utilidades',component:UtilidadesComponent}

];

@NgModule({
  declarations: [
    AppComponent,
    BackgroundComponent,
    HomeComponent,
    BackgroundDosComponent,
    AtajosComponent,
    UtilidadesComponent,
    AcercaDeComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
