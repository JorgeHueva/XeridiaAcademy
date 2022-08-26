import { Component, OnInit } from '@angular/core';
import { Fav } from '../../interfaces/Fav';
import { PedidoService } from '../../servicios/pedido.service';
import { Person } from '../../interfaces/person';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  cliente: Person = {};
  conectado: Person = {};
  favo: Fav = {

    typeCoffe: '',
    price: 0,
    description: '',
    cliente : {nombre:'', apellido:'', email:'', password: ''},
  };

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
        this.pedidoServicio.obtenerfav(this.pedidoServicio.logeado.email).subscribe(data =>
          this.pedidoServicio.favoritos = data
        )
      }
    })
    this.cliente = this.conectado;
  }

  logout(){
    this.conectado = {};
    this.pedidoServicio.logeado = this.conectado;
    this.pedidoServicio.favoritos = [];
  }
}
