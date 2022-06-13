
//Modules

import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';


//Components

import { HomeComponent } from './components/home/home.component';
import { AtajosComponent } from './components/atajos/atajos.component';
import { UtilidadesComponent } from './components/utilidades/utilidades.component';

const routes: Routes = [
  {path: '',component: HomeComponent},{
  path:'atajos',component:AtajosComponent},
{path:'utilidades',component:UtilidadesComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule],
})
export class AppRoutingModule {


}
