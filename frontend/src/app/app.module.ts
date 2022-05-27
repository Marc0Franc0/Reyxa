import { NgModule, Component } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ComponentePrueba } from './components/componente-prueba/componente-prueba';
import {CirculoAnimadoComponent} from './components/circulo-animado/circulo-animado.component'
@NgModule({
  declarations: [AppComponent,ComponentePrueba,CirculoAnimadoComponent],
  imports: [
    BrowserModule,
    AppRoutingModule,
    // import HttpClientModule after BrowserModule.
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent],
})
export class AppModule {}
