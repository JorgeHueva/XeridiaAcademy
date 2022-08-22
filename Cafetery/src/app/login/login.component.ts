import { Component, OnInit } from '@angular/core';
import { PedidoService } from '../pedido.service';
import { Person } from '../person';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  cliente: Person = {};
  dataSource: Person [] = [];

  constructor(private pedidoServicio: PedidoService) { }

  ngOnInit() {
    this.obtenerCliente ()
  }

  onSubmit(){
  }

  private obtenerCliente (){
    this.pedidoServicio.obtenerListaClientes().subscribe(dato => {
      this.dataSource = dato;
    } )
  }
  login(){
    for(let i = 0; i < this.dataSource.length; i++){
      if (this.dataSource[i].email == this.cliente.email && this.dataSource[i].password == this.cliente.password){
        console.log("EXITO")
      }
    }
  }
}
