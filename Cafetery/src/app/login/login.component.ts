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
  conectado: Person = {};
  log: Person = {};

  constructor(private pedidoServicio: PedidoService) { }

  ngOnInit() {
    this.conectado;
  }

  login(){
    this.pedidoServicio.login(this.cliente).subscribe(dato => this.conectado = dato as Person);
    this.cliente = this.conectado;
  }
  logout(){
    this.conectado = {};
  }
}
