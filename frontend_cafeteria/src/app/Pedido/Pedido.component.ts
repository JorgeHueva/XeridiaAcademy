import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTable } from '@angular/material/table';
import { PaginaPrincipalComponent } from '../pagina-principal/pagina-principal.component';



@Component({
  selector: 'app-Pedido',
  templateUrl: './Pedido.component.html',
  styleUrls: ['./Pedido.component.css']
})
export class PedidoComponent implements OnInit {

  columnas: string[] = ['Tipo', 'Numero', 'Precio', 'borrar'];

  datos: Pedido[] = [];



  borrarFila(cod: number) {
    if (confirm("Realmente quiere borrarlo?")) {
      this.datos.splice(cod, 1);
      tabla1.renderRows();
    }
  }

  constructor() { }

  ngOnInit() {
  }
}

export class Pedido {
  constructor(public tipo: string, public numero: number) {
  }
}
