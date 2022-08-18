import { Component, OnInit, ViewChild, AfterViewInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';

import { Coffe } from '../coffe';
import { PedidoService } from '../pedido.service';
import { Coffe_o } from '../coffe_o';


@Component({
  selector: 'app-pagina-principal',
  templateUrl: './pagina-principal.component.html',
  styleUrls: ['./pagina-principal.component.css']
})
export class PaginaPrincipalComponent implements OnInit {

  columnas: string[] = ['tipo', 'precio', 'descripcion', 'imagen'] ;

  cafes: Coffe[] = [];
  contador: number = 0;

  pedido: Array<Coffe_o> = this.pedidoServicio.order;
  coffe_o: Coffe_o = {numCoffe: 0, price:0, typeCoffe:""};
  dataSource = new MatTableDataSource<Coffe>();

  @ViewChild(MatPaginator, { static: true }) paginator!: MatPaginator;

  constructor(private pedidoServicio: PedidoService) {}

  ngOnInit() {
      this.dataSource.paginator = this.paginator;
      this.obtenerCoffe();
      this.filterTable();
  }

  filterTable() {

    this.dataSource.filterPredicate = (data: Coffe, filter: string): boolean => {

      return (

        data.typeCoffe.toLocaleLowerCase().includes(filter)

      )
    }
  }

  filtrar(event: Event) {
    const filtro = (event.target as HTMLInputElement).value;
    this.dataSource.filter = filtro.trim().toLowerCase();
  }

  private obtenerCoffe (){
    this.pedidoServicio.obtenerLista().subscribe(dato => {
      this.dataSource.data = dato;
      this.cafes = dato;

    } )
  }

  onSubmit (){
    this.contador = 0;

    for (let i = 0; i < this.pedido.length; i++){
      if (this.pedido[i].typeCoffe == this.coffe_o.typeCoffe){
        this.pedido[i].price =  (this.pedido[i].price)/this.pedido[i].numCoffe;
        this.pedido[i].numCoffe = this.pedido[i].numCoffe + this.coffe_o.numCoffe;
        this.pedido[i].price =  (this.pedido[i].price)*this.pedido[i].numCoffe;
        this.pedido[i].price = Number(this.pedido[i].price.toFixed(2));
        this.contador = 1;
        break;
      }
    }
    if(this.contador != 1)  {
      for (let i = 0; i < this.cafes.length; i++){
        if (this.cafes[i].typeCoffe == this.coffe_o.typeCoffe){
          this.coffe_o.price = this.cafes[i].price * this.coffe_o.numCoffe;
          this.coffe_o.price = Number(this.coffe_o.price.toFixed(2));
          this.contador = 2;
          break;
        }
      }
    }

    if(this.contador == 2 && this.coffe_o.numCoffe > 0){
      this.pedido.push(this.coffe_o);
    }

    this.coffe_o = {numCoffe: 0, price:0, typeCoffe:""};
    this.pedidoServicio.order = this.pedido;
  }
}

