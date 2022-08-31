package com.xeridia.e.Bucles;

public class EjercicioFiguras {
    public static void main(String[] args) {
        //   TRIANGULO el bucle externo dibuja fila a fila
//        for(int i=1;i<5;i++){
//           // tantos * como nº iteraciones bucle externo
//            for(int k=1;k<i;k++){
//                System.out.print('*');
//            }
//            System.out.println('*');
//        }
////         CUADRADO
//
//        for (int i = 1; i < 5 ; i++) {
//            for (int j = 0; j < 5 ; j++) {
//                System.out.print(" *");
//            }
//            System.out.print(" \n");
//        }

//        //CUADRADO VACIO
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j <= 5; j++) {
//                if (j == 1 || j == 5 || i==1 || i==5) {
//                    System.out.print("*");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//        }
            //TRIANGULO INVERSO

        for (int i = 5; i > 0; i--) {
            for (int j = 0; j <= 5; j++) {
                if (j >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}