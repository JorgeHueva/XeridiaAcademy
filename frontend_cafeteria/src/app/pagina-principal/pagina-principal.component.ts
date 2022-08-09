import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTable, MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { FormControl, FormGroup } from '@angular/forms';
import { Coffe } from '../coffe';
import { PedidoService } from '../pedido.service';
import { Coffe_o } from '../coffe_o';




@Component({
  selector: 'app-pagina-principal',
  templateUrl: './pagina-principal.component.html',
  styleUrls: ['./pagina-principal.component.css']
})
export class PaginaPrincipalComponent implements OnInit {

  columnas: string[] = ['tipo', 'precio'];

  cafes: Coffe[] = [];

  pedido: Array<Coffe_o> = [];
  coffe_o: Coffe_o = new Coffe_o;
  dataSource:any;

  @ViewChild(MatPaginator, { static: true }) paginator!: MatPaginator;

  constructor(private pedidoServicio: PedidoService) {

  }

  ngOnInit() {
      this.obtenerCoffe();
      this.dataSource = new MatTableDataSource<Coffe>(this.cafes);
      this.dataSource.paginator = this.paginator;
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
    this.coffe_o.price = 3;
    this.pedido.push(this.coffe_o);
    this.coffe_o = new Coffe_o;
    this.pedidoServicio.order = this.pedido;
    console.log (this.pedidoServicio.order);
  }

}

