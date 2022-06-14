import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HomeComponent } from './components/home/home.component';

import { AtajosComponent } from './components/atajos/atajos.component';
import { Router, RouterModule, Routes } from '@angular/router';
import { UtilidadesComponent } from './components/utilidades/utilidades.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';

import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


//Lo que hay instalar para que funcione correctamente todo el proyecto
//Tener previamente instalado en el pc node.js y jdk
//cd frontend -> npm install
 //cd frontend -> npm install bootstrap
 //cd frontend -> npm install sweetalert2
@NgModule({
  declarations: [
    AppComponent,

    HomeComponent,

    AtajosComponent,
    UtilidadesComponent,
    AcercaDeComponent
  ],
  imports: [
    BrowserModule,
     BrowserAnimationsModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule

  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
