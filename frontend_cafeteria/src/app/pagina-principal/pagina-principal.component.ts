import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTable, MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { FormControl, FormGroup } from '@angular/forms';
import { Coffe } from '../coffe';
import { PedidoService } from '../pedido.service';
import { Coffe_o } from '../coffe_o';
import { ValueConverter } from '@angular/compiler/src/render3/view/template';




@Component({
  selector: 'app-pagina-principal',
  templateUrl: './pagina-principal.component.html',
  styleUrls: ['./pagina-principal.component.css']
})
export class PaginaPrincipalComponent implements OnInit {

  columnas: string[] = ['tipo', 'precio', 'descripcion'];
  cafes: Coffe[] = [];

  pedido: Array<Coffe_o> = this.pedidoServicio.order;
  coffe_o: Coffe_o = new Coffe_o;
  dataSource:any;

  @ViewChild(MatTable) tabla2!: MatTable<Coffe_o>;

  constructor(private pedidoServicio: PedidoService) {

  }

  ngOnInit() {
      this.obtenerCoffe();
    }

  filtrar(event: Event) {
      const filtro = (event.target as HTMLInputElement).value;
      this.dataSource.filter = filtro.trim().toLowerCase();
  }
  private obtenerCoffe (){
    this.pedidoServicio.obtenerLista().subscribe(dato => {
      this.cafes = dato;
    } )

  }

  onSubmit (){
    for (let i = 0; i < this.cafes.length; i++){
      if (this.cafes[i].typeCoffe == this.coffe_o.typeCoffe){
        this.coffe_o.price = this.cafes[i].price * this.coffe_o.numCoffe;
      }
    }
    //this.coffe_o.price = 3;
    this.pedido.push(this.coffe_o);
    this.coffe_o = new Coffe_o;
    this.pedidoServicio.order = this.pedido;
  }

}

