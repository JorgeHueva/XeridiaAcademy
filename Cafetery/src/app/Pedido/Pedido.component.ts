import { Component, OnInit, ViewChild, } from '@angular/core';
import { MatTable } from '@angular/material/table';
import { Router } from '@angular/router';
import { Coffe_o } from '../coffe_o';
import { PedidoService } from '../pedido.service';


@Component({
  selector: 'app-Pedido',
  templateUrl: './Pedido.component.html',
  styleUrls: ['./Pedido.component.css']
})
export class PedidoComponent implements OnInit {

  columnas: string[] = ['Tipo', 'Numero', 'Precio', 'borrar'];
  datos: Array<Coffe_o> = [];

  @ViewChild(MatTable) tabla1!: MatTable<Coffe_o>;


  constructor(private pedidoServicio: PedidoService, private router: Router) { }

  borrarFila(cod: number) {
    if (confirm("Realmente quiere borrarlo?")) {
      this.datos.splice(cod, 1);
      this.tabla1.renderRows();
    }
  }


  guardarCafes(){
    this.pedidoServicio.registrarCafes(this.datos).subscribe();
    this.reinicioLista ();
  }
  reinicioLista (){
    this.pedidoServicio.order = [];
  }
  ngOnInit() {
    this.datos = this.pedidoServicio.order;
  }

}
