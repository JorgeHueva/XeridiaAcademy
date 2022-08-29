import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';

import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { MatMenuModule } from '@angular/material/menu';
import { MatRadioModule } from '@angular/material/radio';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatTableModule } from '@angular/material/table';
import { MatPaginatorModule } from '@angular/material/paginator';
import { PedidoComponent } from './componentes/Pedido/Pedido.component';
import { PaginaPrincipalComponent } from './componentes/pagina-principal/pagina-principal.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { MatSelectModule } from '@angular/material/select';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import { MatDialogModule } from '@angular/material/dialog';
import { DialogBoxComponent } from './componentes/dialog-box/dialog-box.component';
import { MatSortModule } from '@angular/material/sort';
import { DescripcionCafeteriaComponent } from './componentes/descripcion-cafeteria/descripcion-cafeteria.component';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { RegistroComponent } from './componentes/registro/registro.component';
import {MatStepperModule} from '@angular/material/stepper';
import { LoginComponent } from './componentes/login/login.component';
import { FavoritosComponent } from './componentes/favoritos/favoritos.component';

import { MatExpansionModule } from '@angular/material/expansion';
import { MatListModule } from '@angular/material/list';

import {MatButtonToggleModule} from '@angular/material/button-toggle';
import { JuegosComponent } from './componentes/juegos/juegos.component';
import { Juego_dinosaurioComponent } from './componentes/juego_dinosaurio/juego_dinosaurio.component';
import { ComidaComponent } from './componentes/comida/comida.component';

import {MatCardModule} from '@angular/material/card';
import {MatGridListModule} from '@angular/material/grid-list';



@NgModule({
  declarations: [
    AppComponent,
    PedidoComponent,
    PaginaPrincipalComponent,
      DialogBoxComponent,
      DescripcionCafeteriaComponent,
      RegistroComponent,
      LoginComponent,
      FavoritosComponent,
      JuegosComponent,
      ComidaComponent,
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
    MatTableModule,MatSelectModule,
    MatToolbarModule,
    MatIconModule,
    MatDialogModule,
    MatPaginatorModule,
    MatSortModule,
    MatSnackBarModule,
    MatStepperModule,
    ReactiveFormsModule,
    MatListModule,
    MatExpansionModule,
    MatButtonToggleModule,
    MatCardModule,
    MatGridListModule,
    RouterModule.forRoot([
      {path: 'pagina-principal', component: PaginaPrincipalComponent},
      {path: 'Pedido', component: PedidoComponent},
      {path: 'descripcion-cafeteria', component:DescripcionCafeteriaComponent},
      {path: '', redirectTo: '/descripcion-cafeteria', pathMatch: 'full'},
      {path: 'registro', component: RegistroComponent},
      {path: 'login', component: LoginComponent},
      {path: 'Favoritos', component: FavoritosComponent},
      {path: 'juegos', component: JuegosComponent},
      {path: 'juego_dinosaurio', component: Juego_dinosaurioComponent},
      {path: 'comida', component: ComidaComponent},
    ]),

   ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
