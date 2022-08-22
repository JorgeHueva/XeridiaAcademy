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
import { PedidoComponent } from './Pedido/Pedido.component';
import { PaginaPrincipalComponent } from './pagina-principal/pagina-principal.component';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { MatSelectModule } from '@angular/material/select';
import {MatToolbarModule} from '@angular/material/toolbar';
import {MatIconModule} from '@angular/material/icon';
import { MatDialogModule } from '@angular/material/dialog';
import { DialogBoxComponent } from './dialog-box/dialog-box.component';
import { MatSortModule } from '@angular/material/sort';
import { DescripcionCafeteriaComponent } from './descripcion-cafeteria/descripcion-cafeteria.component';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import { RegistroComponent } from './registro/registro.component';
import {MatStepperModule} from '@angular/material/stepper';
import { LoginComponent } from './login/login.component';




@NgModule({
  declarations: [
    AppComponent,
    PedidoComponent,
    PaginaPrincipalComponent,
      DialogBoxComponent,
      DescripcionCafeteriaComponent,
      RegistroComponent,
      LoginComponent,
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
    RouterModule.forRoot([
      {path: 'pagina-principal', component: PaginaPrincipalComponent},
      {path: 'Pedido', component: PedidoComponent},
      {path: 'descripcion-cafeteria', component:DescripcionCafeteriaComponent},
      {path: '', redirectTo: '/descripcion-cafeteria', pathMatch: 'full'},
      {path: 'registro', component: RegistroComponent},
      {path: 'login', component: LoginComponent},
    ]),

   ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
