import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { DescripcionCafeteriaComponent } from './componentes/descripcion-cafeteria/descripcion-cafeteria.component';
import { PaginaPrincipalComponent } from './componentes/pagina-principal/pagina-principal.component';
import { PedidoComponent } from './componentes/Pedido/Pedido.component';
import { RegistroComponent } from './componentes/registro/registro.component';



const routes: Routes = [
  {path: 'pagina-principal' , component:PaginaPrincipalComponent},
  {path: '', redirectTo: '/pagina-principal' , pathMatch: 'full'},
  {path: 'Pedidos',component:PedidoComponent},
  {path: 'descripcion-cafeteria', component:DescripcionCafeteriaComponent},
  {path: 'registro',component:RegistroComponent},
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
