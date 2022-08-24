import { Component, OnInit } from '@angular/core';
import { Coffe } from '../coffe';
import { PedidoService } from '../pedido.service';

@Component({
  selector: 'app-favoritos',
  templateUrl: './favoritos.component.html',
  styleUrls: ['./favoritos.component.css']
})
export class FavoritosComponent implements OnInit {

  favPanelOpenState = false;

  favoritos: Array<Coffe> = this.pedidoServicio.favoritos;

  constructor(private pedidoServicio: PedidoService) { }

  ngOnInit() {

  }

}