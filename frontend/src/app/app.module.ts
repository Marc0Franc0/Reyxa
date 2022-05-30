import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BackgroundComponent } from './components/background/background.component';
import { HomeComponent } from './components/home/home.component';
import { BackgroundDosComponent } from './components/background-dos/background-dos.component';

@NgModule({
  declarations: [
    AppComponent,
    BackgroundComponent,
    HomeComponent,
    BackgroundDosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
