package com.xeridia.f.Objetos.ejercicios.supermercado;

import com.xeridia.f.Objetos.teoria.Persona;

import java.util.Arrays;

public class Almacen {
   final int MAX_PRODUCTO = 200;
   private int productoInicial = 0;
   private int maxAmount = 10;


   private final Producto [] producto;  //se define el array
   //CONSTRUCTORES
   public Almacen() {
      producto = new Producto[MAX_PRODUCTO];
   }

   //METODO SEARCH
   public Producto searchEmp (String nombre){
      int pos = this.searchPos(nombre);
      if (pos == -1) return null;
      return this.producto[pos];
   }

   public int searchPos (String nombre){
      for (int i = 0; i < this.producto.length; i++) {      //a.equals(b) <=> a == b
         if (this.producto [i] != null && this.producto[i].getNombre().equals(nombre)) {
            return i;
         }
      }
      return -1;
   }

   //METODO ADD
         // CONTADOR
   public int cont (){
      int cont = 0;
      for (int i = 0; i < this.producto.length; i++) {
         if (this.producto[i] != null){
            cont = cont + producto[i].getCantidad();
         }
      }
      return cont;
   }
   public boolean add (Producto producto){
      if(searchName(producto.getNombre())){
         return false;
      } else {
         //introducir que como maximo haya 10 productos
         if((cont()+producto.getCantidad())<maxAmount){
            for (int i = 0; i < this.producto.length; i++) {
               if (this.producto[i] == null ) {
                  this.producto[i] = producto;

                  return true;
               }
            }
         }
      }
      return false;
      }
   // Buscar si el nombre
   public boolean searchName (String nombre){
      for (int i = 0; i < this.producto.length; i++) {
         if (this.producto [i] != null && this.producto[i].getNombre().equals(nombre)) {
            return true;
         }
      }
      return false;
   }


   //METODO REMOVE
   public boolean remove (String nombre, int cantidad){
      int resto = 0;
      int pos = this.searchPos(nombre);
      if (pos == -1){
         return false;
      } else {
         resto = this.producto[pos].getCantidad() - cantidad;
         if (this.producto[pos].proveNumber(cantidad)){
            if (resto == 0){
               this.producto[pos] = null;
               return false;
            } else if( resto < 0){
                       return false;
            } else {
               this.producto[pos].setCantidad(resto);
               return false;
            }
         }
      }
      return true;
   }





   //GETTER & SETTER
   public int getMAX_PRODUCTO() {
      return MAX_PRODUCTO;
   }

   public Producto[] getProducto() {
      return producto;
   }

// PARA QUE LEA TODOS LOS VALORES RELLENOS DEL ARRAY
   @Override
   public String toString() {
      StringBuilder output = new StringBuilder("Producto: " + this.producto + "\n Lista productos: \n");
      for (int i = 0; i < this.producto.length; i++) {
         if (this.producto[i]== null){
         } else {
            output.append(producto[i]).append("\n");
         }
      }
      return output.toString();

   }
}
