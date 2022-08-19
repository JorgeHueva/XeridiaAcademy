import { Component, OnInit } from '@angular/core';
import { PedidoService } from '../pedido.service';
import { Person } from '../person';


@Component({
  selector: 'app-registro',
  templateUrl: './registro.component.html',
  styleUrls: ['./registro.component.css']
})
export class RegistroComponent implements OnInit {

  person: Person = {};

  constructor(private servicioRegistro: PedidoService) { }

  ngOnInit() {

  }

  onSubmit(){
    console.log(this.person);
  }

  Guardar(){
    console.log(this.person);
    this.servicioRegistro.registroClientes(this.person).subscribe();
  }
}
