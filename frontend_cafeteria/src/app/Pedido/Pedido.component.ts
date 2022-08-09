import { Component, OnInit, } from '@angular/core';
import { Coffe } from '../coffe';
import { Coffe_o } from '../coffe_o';
import { Pedido } from '../Pedido';
import { PedidoService } from '../pedido.service';

@Component({
  selector: 'app-Pedido',
  templateUrl: './Pedido.component.html',
  styleUrls: ['./Pedido.component.css']
})
export class PedidoComponent implements OnInit {

  columnas: string[] = ['Tipo', 'Numero', 'Precio', 'borrar'];

  datos: Array<Coffe_o> = [];


  constructor(private pedidoServicio: PedidoService) { }

  ngOnInit() {
    this.datos = this.pedidoServicio.order;
  }

}
