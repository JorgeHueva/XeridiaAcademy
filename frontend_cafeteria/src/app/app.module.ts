import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule } from '@angular/forms';

import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { MatMenuModule } from '@angular/material/menu';
import { MatRadioModule } from '@angular/material/radio';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatTableModule } from '@angular/material/table';
import { MatPaginatorModule } from '@angular/material/paginator';
import { PedidoComponent } from './Pedido/Pedido.component';
import { PaginaPrincipalComponent } from './pagina-principal/pagina-principal.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';




@NgModule({
  declarations: [
    AppComponent,
    PedidoComponent,
    PaginaPrincipalComponent,
   ],
  imports: [
    HttpClientModule,
    BrowserModule,
    BrowserAnimationsModule,
    MatInputModule,
    MatButtonModule,
    FormsModule,
    MatMenuModule,
    MatRadioModule,
    MatFormFieldModule,
    MatTableModule,

    MatPaginatorModule,
    RouterModule.forRoot([
      {path: 'pagina-principal', component: PaginaPrincipalComponent},
      {path: 'Pedido', component: PedidoComponent},
      {path: '', redirectTo: '/Pedido', pathMatch: 'full'}
    ]),

   ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
