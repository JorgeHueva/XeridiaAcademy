import { Component, OnInit } from '@angular/core';
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

       console.log(this.comida);
      }
    }

  }

  restar(nombre: string){
    for (let i = 0; i < this.order.length ; i++){
      if (this.order[i].typeFood == nombre && this.order[i].cantidad > 0){
        this.order[i].cantidad --;
       //console.log(this.order);
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
    console.log(this.order);

  }

}
