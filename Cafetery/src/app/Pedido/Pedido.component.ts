import { Component, OnInit, ViewChild, } from '@angular/core';
import { MatTable } from '@angular/material/table';
import { Router } from '@angular/router';
import { Coffe_o } from '../coffe_o';
import { PedidoService } from '../pedido.service';
import { MatDialog } from '@angular/material/dialog';
import { DialogBoxComponent } from '../dialog-box/dialog-box.component';

export interface Coffe {
  typeCoffe: string;
  price: number;
  description: string;
}

@Component({
  selector: 'app-Pedido',
  templateUrl: './Pedido.component.html',
  styleUrls: ['./Pedido.component.css']
})
export class PedidoComponent implements OnInit {

  columnas: string[] = ['Tipo', 'Numero', 'Precio', 'borrar', 'editar'];
  datos: Array<Coffe_o> = [];

  @ViewChild(MatTable) tabla1!: MatTable<Coffe_o>;
  //@ViewChild(MatTable,{static:true}) tabla1!: MatTable<any>;

  constructor(private pedidoServicio: PedidoService, private router: Router) { }

  borrarFila(cod: number) {
    if (confirm("Realmente quiere borrarlo?")) {
      this.datos.splice(cod, 1);
      this.tabla1.renderRows();
    }
  }

  editarFila(row_obj: { numCoffe: number; typeCoffe: string; }) {
    this.datos = this.datos.filter((value)=>{
      if(value.typeCoffe == row_obj.typeCoffe){
        value.numCoffe = row_obj.numCoffe;
      }
      return true;
    });
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
