import { Component, OnInit, ViewChild, } from '@angular/core';
import { MatTable } from '@angular/material/table';
import { Router } from '@angular/router';
import { Coffe_o } from '../coffe_o';
import { PedidoService } from '../pedido.service';
import { MatDialog } from '@angular/material/dialog';
import { DialogBoxComponent } from '../dialog-box/dialog-box.component';

export interface CoffeeData {
  typeCoffe: string;
  description: string;
}

@Component({
  selector: 'app-Pedido',
  templateUrl: './Pedido.component.html',
  styleUrls: ['./Pedido.component.css']
})
export class PedidoComponent implements OnInit {

  columnas: string[] = ['Tipo', 'Numero', 'Precio', 'action'];
  datos: Array<Coffe_o> = [];

  datasource = this.datos;
  total: number = 0;


  @ViewChild(MatTable,{static:true}) tabla1!: MatTable<Coffe_o>;

  constructor(public dialog: MatDialog, private pedidoServicio: PedidoService, private router: Router) { }

  openDialog(action: any,obj: { action: any; }) {
    obj.action = action;
    const dialogRef = this.dialog.open(DialogBoxComponent, {
      width: '250px',
      data:obj
    });

    dialogRef.afterClosed().subscribe(result => {
      if(result.event == 'Update'){
        this.updateRowData(result.data);
      }else if(result.event == 'Delete'){
        this.deleteRowData(result.data);
      }
    });
  }

  updateRowData(row_obj: { typeCoffe: String; numCoffe: number; }){
    this.datos = this.datos.filter((value,key)=>{
      if(value.typeCoffe == row_obj.typeCoffe && row_obj.numCoffe > 0){
        value.price = value.price/value.numCoffe;
        value.numCoffe = row_obj.numCoffe;
        value.price = row_obj.numCoffe*value.price;
        value.price = Number(value.price.toFixed(2));
        value.numCoffe = Number(value.numCoffe);
        this.sumarTotal();
      }
      return true;
    });
  }

  deleteRowData(row_obj: { typeCoffe: String; numCoffe: number; }){
    this.datos = this.datos.filter((value,key)=>{
      return value.typeCoffe != row_obj.typeCoffe;
    });
  }

  guardarCafes(){
    this.pedidoServicio.registrarCafes(this.datos).subscribe();
    this.reinicioLista ();
  }
  reinicioLista (){
    this.pedidoServicio.order = [];
  }
  sumarTotal(){
    this.total = 0;
    for (let i = 0; i < this.datos.length; i++){
      this.total = this.total + this.datos[i].price;
    }
  }
  ngOnInit() {
    this.datos = this.pedidoServicio.order;
    this.sumarTotal();
  }

}
