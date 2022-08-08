import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PaginaPrincipalComponent } from './pagina-principal/pagina-principal.component';
import { PedidoComponent } from './Pedido/Pedido.component';


const routes: Routes = [
  {path: 'pagina-principal' , component:PaginaPrincipalComponent},
  {path: '', redirectTo: '/pagina-principal' , pathMatch: 'full'},
  {path: 'Pedidos',component:PedidoComponent},
  {path: '', redirectTo:'/Pedido', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
