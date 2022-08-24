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

  constructor(private pedidoServicio: PedidoService) { }

  ngOnInit() {
    this.conectado = this.pedidoServicio.logeado;
  }

  login(){
    this.pedidoServicio.login(this.cliente).subscribe(dato => {
      if (dato == null){
        this.conectado = {};
        window.alert ("Usuario invalido, pruebe otra vez")
      }else{
        this.conectado = dato as Person;
        this.pedidoServicio.logeado = this.conectado;
      }
    })
    this.cliente = this.conectado;

  }
  logout(){
    this.conectado = {};
    this.pedidoServicio.logeado = this.conectado;
  }
}
