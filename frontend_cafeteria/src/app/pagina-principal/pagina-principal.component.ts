import { Component, OnInit, ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { FormControl, FormGroup } from '@angular/forms';

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

  profileForm = new FormGroup({
    tipoCofee: new FormControl(''),
    numCoffe: new FormControl()
  });

  @ViewChild(MatPaginator, { static: true }) paginator!: MatPaginator;
  operacionSeleccionada: string = 'Casa';
  tipoOperaciones = [
    'Casa',
    'Tienda',
  ];
  operar() {
    switch (this.operacionSeleccionada) {
      case 'Casa' : this.resultado = 'Tu pedido es para llevar';
                    break;
      case 'Tienda' : this.resultado = 'Tu pedido es para tomar aqui';
                     break;
    }
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
