import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DescripcionCafeteriaComponent } from './descripcion-cafeteria/descripcion-cafeteria.component';
import { PaginaPrincipalComponent } from './pagina-principal/pagina-principal.component';
import { PedidoComponent } from './Pedido/Pedido.component';



const routes: Routes = [
  {path: 'pagina-principal' , component:PaginaPrincipalComponent},
  {path: '', redirectTo: '/pagina-principal' , pathMatch: 'full'},
  {path: 'Pedidos',component:PedidoComponent},
  {path: 'descripcion-cafeteria', component:DescripcionCafeteriaComponent},
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
