package com.xeridia.e.Bucles;

import com.xeridia.utils.Teclado;

public class Teoria {
    public static void main(String[] args) {

//        boolean salirse = false;
//        while (!salirse) {
//            System.out.println("Quieres salirte?(1 SI / 0 NO)");
//            if (Teclado.readInteger() == 1){
//                break;
//            }
//            System.out.println("No se ha salido");
//        }
//        System.out.println("Has salido");

        int contador = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Quieres saltar un numero? (0/1)");
            if (Teclado.readInteger() == 1){
                continue;
            }
            contador ++;
        }
        System.out.println(contador);
    }
}