package com.xeridia.f.Objetos.ejercicios.supermercado;

public class Mainsupermercado {
    public static void main(String[] args) {

        /*
        el supermercado tieme um almacen
        el almacen tiene una lista de productos
        los productos tienen nombre, precio y cantidad
         */

        Producto fresas = new Producto(2, 2, "fresas");
        Producto papel = new Producto(1, 1, "papel");
        Producto manzanas = new Producto(1.5, 6, "manzanas");


        Supermercado supermercado = new Supermercado("Mercadona");
        supermercado.addAlmacen(fresas);
        supermercado.addAlmacen(papel);
        supermercado.addAlmacen(manzanas);

        supermercado.removeAlmacen("fresas",2);
//        supermercado.searchAlmacen("papel");
//        supermercado.searchPosAlmacen("papel");

        System.out.println(supermercado);





    }
}
