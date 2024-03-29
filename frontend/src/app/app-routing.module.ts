import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';

//Modules

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


//Components

import { HomeComponent } from './components/home/home.component';
import { AtajosComponent } from './components/atajos/atajos.component';
import { UtilidadesComponent } from './components/utilidades/utilidades.component';

/*
Explicar

 */
const routes: Routes =
[
  {path: '',component: HomeComponent},
  {path:'atajos',component:AtajosComponent},
{path:'utilidades',component:UtilidadesComponent},
{path:'acercaDe',component:AcercaDeComponent},


];
/*

*/
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {


}
