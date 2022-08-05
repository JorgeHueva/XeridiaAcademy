import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PedidoComponent } from './Pedido/Pedido.component';


const routes: Routes = [
  {path: 'Pedidos',component:PedidoComponent},
  {path: '', redirectTo:'/Pedido', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
