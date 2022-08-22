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
  conectado: Person = {};

  constructor(private pedidoServicio: PedidoService) { }

  ngOnInit() {
    this.conectado;
  }

  onSubmit(){
  }

  login(){
    this.pedidoServicio.login(this.cliente).subscribe();
  }
  logout(){
  
  }
}
