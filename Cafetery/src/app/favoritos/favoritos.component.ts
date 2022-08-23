import { Component, OnInit } from '@angular/core';
import { Coffe } from '../coffe';

@Component({
  selector: 'app-favoritos',
  templateUrl: './favoritos.component.html',
  styleUrls: ['./favoritos.component.css']
})
export class FavoritosComponent implements OnInit {

  favPanelOpenState = false;

  //columnas: string[] = ['tipo', 'precio', 'descripcion', 'imagen'] ;

  cafes: Coffe[] = [];

  constructor() { }

  ngOnInit() {
  
  }

}
