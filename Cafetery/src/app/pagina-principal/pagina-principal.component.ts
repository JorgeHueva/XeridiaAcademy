import { Component, OnInit, ViewChild} from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { MatPaginator } from '@angular/material/paginator';
import { Coffe } from '../coffe';
import { PedidoService } from '../pedido.service';
import { Coffe_o } from '../coffe_o';
import {MatSnackBar} from '@angular/material/snack-bar';

import { Fav } from '../fav';


@Component({
  selector: 'app-pagina-principal',
  templateUrl: './pagina-principal.component.html',
  styleUrls: ['./pagina-principal.component.css']
})
export class PaginaPrincipalComponent implements OnInit {

  columnas: string[] = ['tipo', 'precio', 'descripcion', 'imagen', 'favoritos'] ;

  cafes: Coffe[] = [];
  contador: number = 0;

  favori: Fav = {

    typeCoffe: '',
    price: 0,
    description: '',
    cliente : {nombre:'', apellido:'', email:'', password: ''},
  };


  pedido: Array<Coffe_o> = this.pedidoServicio.order;
  coffe_o: Coffe_o = {numCoffe: 0, price:0, typeCoffe:""};
  dataSource = new MatTableDataSource<Coffe>();


  @ViewChild(MatPaginator, { static: true }) paginator!: MatPaginator;

  constructor(private pedidoServicio: PedidoService, private _snackBar: MatSnackBar) {}

  ngOnInit() {
      this.dataSource.paginator = this.paginator;
      this.obtenerCoffe();
      this.filterTable();
      console.log (this.pedidoServicio.logeado);
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

  openSnackBar() {
    if (this.coffe_o.typeCoffe != "" && this.coffe_o.numCoffe > 0){
      this._snackBar.open( String (this.coffe_o.typeCoffe),"Añadido",{duration: 1000, horizontalPosition:'end', verticalPosition: 'bottom'});
    }

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

  addFavoritos(coffe: string){

    if (this.pedidoServicio.logeado.nombre != undefined){
        for (let i=0; i < this.cafes.length; i++){
        if (this.cafes[i].typeCoffe == coffe){
          this.favori = {typeCoffe: this.cafes[i].typeCoffe, description: this.cafes[i].description, price: this.cafes[i].price, cliente: this.pedidoServicio.logeado}  ;
          this.pedidoServicio.fav(this.favori).subscribe(data=>
            this.pedidoServicio.favoritos = data
            );
          break;
        }
      }
    }else{
      window.alert ("Por favor haz Login");
    }

    console.log(this.pedidoServicio.favoritos);
  }
}

