package com.xeridia.dEstructuraCondicionales;

import com.xeridia.utils.Teclado;

public class Mejoraejercicio {
    public static void main(String[] args) {

        System.out.println("Dime que tipo de cafe quieres: ");
        String tipoCafe = Teclado.readString();

        System.out.println("Introduce el numero de cafes: ");
        int numeroCafe = Teclado.readInteger();

        if (numeroCafe <= 0 ) {
            System.out.println("No se puede ");
        } else {

            System.out.println("Dime cuanto cuesta el cafe: ");
            float precioIndividual = Teclado.readFloat();

            System.out.println("Si es para llevar marca 1: ");
            int paraLlevar = Teclado.readInteger();

            boolean llevar = paraLlevar == 1;

            if (llevar) {
                datos(tipoCafe, numeroCafe, precioIndividual, llevar);
                if (numeroCafe > 8) {
//                    System.out.println("Que tipo de cafe has pedido" + tipoCafe);
//                    System.out.println("Has pedido: " + numeroCafe);
//                    System.out.println("El precio es: " + numeroCafe * precioIndividual);

                    // Quitar los decimales a la division cambia de int a float
                    float result = (float) numeroCafe/8;
                    int result1 = (int) result;
                    int bandejas = numeroCafe - 8*result1;

                    if (result >=1 ){
                        if (bandejas <= 2) {
                            System.out.println("Se necesitan " + result1 + "bandejas de 8 y una de 2");
                        } else if (bandejas <= 4) {
                            System.out.println("Se necesitan " + result1 + "bandejas de 8 y una de 4");
                        } else {
                            System.out.println("Se necesitan " + result1 + "bandejas de 8 y una de 8");
                        }
                    }

                } else {
                    switch (numeroCafe){
                        case 1:
                            System.out.println("No lleva bandeja de carton");
                            break;
                        case 2:
                            System.out.println("Se necesita bandeja de 2");
                            break;
                        case 3:
                        case 4:
                            System.out.println("Se necesita bandeja de 4");
                            break;
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                            System.out.println("Se necesita bandeja de 8");
                            break;
                        default:
                            break;
                    }

//                        if (numeroCafe == 1){
//                            System.out.println("No lleva bandeja de carton");
//                        }else if (numeroCafe == 2) {
//                            System.out.println("Se necesita bandeja de 2");
//                        } else if (numeroCafe <= 4) {
//                            System.out.println("Se necesita bandeja de 4");
//                        } else {
//                            System.out.println("Se necesita bandeja de 8");
//                        }

                }
                //NO es para llevar
            } else {
                datos (tipoCafe,numeroCafe,precioIndividual, llevar);

//                System.out.println("Que tipo de cafe has pedido" + tipoCafe);
//                System.out.println("Has pedido: " + numeroCafe);
//                System.out.println("El precio es: " + numeroCafe*precioIndividual);
//                System.out.println("No necesitas bandeja");
            }
        }

    }
    //PARA ACORTAR CODIGO
public static void datos (String tipoCafe, int numeroCafe, float precioIndividual, boolean llevar){
    System.out.println("Has pedido un cafe de tipo : " + tipoCafe);
    System.out.println("Has pedido: " + numeroCafe);
    System.out.println("El precio es: " + numeroCafe * precioIndividual);

    }
}
