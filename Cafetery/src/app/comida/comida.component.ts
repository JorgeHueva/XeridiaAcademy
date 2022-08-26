import { Component, OnInit } from '@angular/core';
import { Food } from '../food';
import { Food_o } from '../food_o';
import { PedidoService } from '../servicios/pedido.service';




@Component({
  selector: 'app-comida',
  templateUrl: './comida.component.html',
  styleUrls: ['./comida.component.css']
})
export class ComidaComponent implements OnInit {

  comida: Food []  = [];
  cantidad: any;

  constructor(private pedidoService: PedidoService) { }

  order: Array <Food_o> = [];
  food_o : Food_o = {
    typeFood: '',
    price: 0,
    cantidad: 0
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
      console.log(this.order[i].cantidad);
      if (this.comida[i].typeFood == nombre){
        this.order[i].cantidad ++;
       // console.log(this.comida[i].cantidad);
      }
    }
    
  }

  restar(nombre: string){
    for (let i = 0; i < this.order.length ; i++){
      console.log(this.order[i].cantidad);
      if (this.order[i].typeFood == nombre && this.order[i].cantidad > 0){
        this.order[i].cantidad ;
       // console.log(this.order[i].cantidad);
      }
    }
  }

  inicializarPedido(){
    // console.log(this.comida.length)
    for (let i = 0; i < this.comida.length ; i++){
      
      this.food_o.typeFood = this.comida[i].typeFood ;
      this.food_o.price = 0;
      this.food_o.cantidad = 0;
      this.order.push(this.food_o);
      
    }
    
  }
  
}
