import { Component, OnInit } from '@angular/core';
import { Coffe } from '../coffe';





@Component({
  selector: 'app-Pedido',
  templateUrl: './Pedido.component.html',
  styleUrls: ['./Pedido.component.css']
})
export class PedidoComponent implements OnInit {

  filas: string[] = ['Tipo', 'Numero', 'Precio', 'borrar'];

  datos: Coffe[] = [];

  constructor() { }

  ngOnInit() {
    this.datos = [{
      "typeCoffe" : "Cafe con leche",
      "price" : 1.50
    }];
  }
}


