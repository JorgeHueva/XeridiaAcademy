package com.xeridia.estructuraDeDatos.ejercicios.supermercado.linkedList;



public class Main {
    public static void main(String[] args) {

        /*
        el supermercado tieme um almacen
        el almacen tiene una lista de productos
        los productos tienen nombre, precio y cantidad
         */

       Producto fresas = new Producto(10,1 , "fresas");
        Producto papel = new Producto(10, 2, "papel");
        Producto manzanas = new Producto(10, 3, "manzamas");

        Supermercado supermercado = new Supermercado("Mercadona");

        supermercado.addAlmacen(fresas);
        supermercado.addAlmacen(papel);
        supermercado.addAlmacen(manzanas);
        System.out.println(supermercado);

        //supermercado.removeAlmacen("fresas",2);

//        supermercado.searchAlmacen("papel");
//        supermercado.searchPosAlmacen("papel");

        supermercado.duplicarAlmacen();

        System.out.println(supermercado);

        supermercado.removeMoreThan5();
        System.out.println(supermercado);

    }
}
