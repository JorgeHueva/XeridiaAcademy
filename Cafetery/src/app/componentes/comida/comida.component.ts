import { Component, OnInit } from '@angular/core';
import { Coffe_o } from 'src/app/interfaces/coffe_o';

import { Food } from '../../interfaces/food';

import { Food_o } from '../../interfaces/food_o';

import { PedidoService } from '../../servicios/pedido.service';



@Component({
  selector: 'app-comida',
  templateUrl: './comida.component.html',
  styleUrls: ['./comida.component.css']
})

export class ComidaComponent implements OnInit {
  comida: Food []  = [];

  cantidad: any;

  o : Coffe_o = {typeCoffe: '', numCoffe: 0, price: 0};

  constructor(private pedidoService: PedidoService) { }


  order: Array <Food_o> = [];

  food_o : Food_o = {

    typeFood: '',

    price: 0,

    cantidad: 0,

    description: '',

    imagen: ''
  }

  ngOnInit() {
    this.food();
  }

  food(){

    this.pedidoService.obtenerFood().subscribe (data =>{
      this.comida = data;
      this.inicializarPedido();
    })
  }

  sumar(nombre: string){

    for (let i = 0; i < this.order.length ; i++){
      if (this.comida[i].typeFood == nombre){
        this.order[i].cantidad ++;
       

      }

    }
  }

  restar(nombre: string){
    for (let i = 0; i < this.order.length ; i++){
      if (this.order[i].typeFood == nombre && this.order[i].cantidad > 0){
        this.order[i].cantidad --;
       

      }
    }
  }

  inicializarPedido(){

    for (let i = 0; i < this.comida.length ; i++){
      this.food_o = {typeFood: '', price: 0, cantidad: 0, description: '', imagen: ''};
      this.food_o.typeFood = this.comida[i].typeFood ;
      this.food_o.description = this.comida[i].description;
      this.food_o.imagen = this.comida[i].imagen;
      this.food_o.price = this.comida[i].price;
      this.food_o.cantidad = 0;
      this.order.push(this.food_o);

    }
  }

  agregarPedido(){

    let cont = 0;
    for (let i = 0; i < this.pedidoService.order.length; i++){
      if (this.order[i].typeFood == this.pedidoService.order[i].typeCoffe){
        
        this.pedidoService.order[i].numCoffe = this.order[i].cantidad + this.pedidoService.order[i].numCoffe;
        this.pedidoService.order[i].price =  this.pedidoService.order[i].numCoffe* this.order[i].price;
        this.pedidoService.order[i].price  = Number(this.pedidoService.order[i].price.toFixed(2));
        cont = 1;
        this.order[i].cantidad = 0;
      }
    } 

    if (cont != 1){
      for (let i=0; i < this.order.length; i++){
        this.o = {typeCoffe: '', numCoffe: 0, price: 0};
        if (this.order[i].cantidad != 0){
          
          this.o.typeCoffe = this.order[i].typeFood;
  
          this.o.price = this.order[i].price * this.order[i].cantidad;
          this.o.numCoffe = this.order[i].cantidad;
         
          this.pedidoService.order.push(this.o);
          this.order[i].cantidad = 0;
        }
      }
    }

    

  }

}
