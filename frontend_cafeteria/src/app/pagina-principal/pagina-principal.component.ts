import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTable, MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { FormControl, FormGroup } from '@angular/forms';
import { Coffe } from '../coffe';
import { PedidoService } from '../pedido.service';


@Component({
  selector: 'app-pagina-principal',
  templateUrl: './pagina-principal.component.html',
  styleUrls: ['./pagina-principal.component.css']
})
export class PaginaPrincipalComponent implements OnInit {

  columnas: string[] = ['tipo', 'precio'];

  cafes: Coffe[] = [];
  dataSource:any;

  @ViewChild(MatPaginator, { static: true }) paginator!: MatPaginator;

  constructor(private pedidoServicio: PedidoService) { }

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
}

