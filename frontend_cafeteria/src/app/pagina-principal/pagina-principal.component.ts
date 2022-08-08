import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTable, MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { FormControl, FormGroup } from '@angular/forms';
import { Pedido } from '../Pedido/Pedido.component';

@Component({
  selector: 'app-pagina-principal',
  templateUrl: './pagina-principal.component.html',
  styleUrls: ['./pagina-principal.component.css']
})
export class PaginaPrincipalComponent implements OnInit {

  valor1 = 0;
  valor2 = 0;
  resultado = '';
  columnas: string[] = ['tipo', 'precio'];

  datos: Cafe[] = [];
  dataSource:any;

  articuloselect: Pedido = new Pedido("", 0);

  profileForm = new FormGroup({
    tipoCofee: new FormControl(''),
    numCoffe: new FormControl()
  });

  @ViewChild(MatPaginator, { static: true }) paginator!: MatPaginator;
  @ViewChild(MatTable) tabla1!: MatTable<Pedido>;

  operacionSeleccionada: string = 'Casa';
  tipoOperaciones = [
    'Casa',
    'Tienda',
  ];
  agregar() {
    this.datos.push(new Pedido(this.articuloselect.tipo, this.articuloselect.numero));
    this.tabla1.renderRows();
    this.articuloselect = new Pedido("", 0);
  }

  ngOnInit() {
      this.datos.push(new Cafe('Cafe con leche', 1.50),new Cafe('Cafe solo', 1.20), new Cafe('Cortado', 1.30),new Cafe('Capuchino', 1.80),new Cafe('Cola Cao', 1.70),new Cafe('Cafe Irlandes', 2.00))
      this.dataSource = new MatTableDataSource<Cafe>(this.datos);
      this.dataSource.paginator = this.paginator;
    }
    filtrar(event: Event) {
      const filtro = (event.target as HTMLInputElement).value;
      this.dataSource.filter = filtro.trim().toLowerCase();
  }
}

export class Cafe {
  constructor(public tipo: String, public precio: number) {
  }
}
