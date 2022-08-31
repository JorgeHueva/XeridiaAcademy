package com.xeridia.e.Bucles;

import com.xeridia.utils.Teclado;

public class ejercicioCafeteria {
    public static void main(String[] args) {
        int pedido;
        int cancelarPedido;


        do {
            System.out.println("Quieres realizar un pedido? (1) SI y (2) NO");
            pedido = Teclado.readInteger();
        } while (pedido != 1 && pedido != 2);

        while (pedido == 1) {

            System.out.println("Dime que tipo de cafe quieres: ");
            String tipoCafe = Teclado.readString();
            switch (tipoCafe) {
                case "solo":
                    System.out.println("Has pedido un cafe solo");
                    break;
                case "cortado":
                    System.out.println("Has pedido un cafe cortado");
                    break;
                case "capuccino":
                    System.out.println("Has pedido un capuccino");
                    break;
                default:
                    System.out.println("No tenemos ese tipo");
            }


        System.out.println("Introduce el numero de cafes: ");
        int numeroCafe = Teclado.readInteger();

        if (numeroCafe <= 0) {
            System.out.println("No se puede ");
        } else {

            System.out.println("Dime cuanto cuesta el cafe: ");
            float precioIndividual = Teclado.readFloat();

            System.out.println("Si es para llevar marca 1: ");
            int paraLlevar = Teclado.readInteger();

            boolean llevar = paraLlevar == 1;
            boolean carton = llevar;


            if (llevar) {
                if (numeroCafe > 8) {
                    System.out.println("Que tipo de cafe has pedido" + tipoCafe);
                    System.out.println("Has pedido: " + numeroCafe);
                    System.out.println("El precio es: " + numeroCafe * precioIndividual);


                    // Quitar los decimales a la division
                    float result = (float) numeroCafe / 8;
                    int result1 = (int) result;
                    int bandejas = numeroCafe - 8 * result1;
                    if (bandejas <= 2) {
                        System.out.println("Se necesitan " + result1 + "bandejas de 8 y una de 2");
                    } else if (bandejas <= 4) {
                        System.out.println("Se necesitan " + result1 + "bandejas de 8 y una de 4");
                    } else {
                        System.out.println("Se necesitan " + result1 + "bandejas de 8 y una de 6");
                    }


                } else {
                    if (numeroCafe == 1) {
                        System.out.println("Que tipo de cafe has pedido" + tipoCafe);
                        System.out.println("Has pedido: " + numeroCafe);
                        System.out.println("El precio es: " + numeroCafe * precioIndividual);
                        System.out.println("No lleva bandeja de carton");
                    } else {
                        System.out.println("Que tipo de cafe has pedido" + tipoCafe);
                        System.out.println("Has pedido: " + numeroCafe);
                        System.out.println("El precio es: " + numeroCafe * precioIndividual);
                        System.out.println("Necesitas bandeja de carton ");
                        if (numeroCafe <= 2) {
                            System.out.println("Se necesita bandeja de 2");
                        } else if (numeroCafe <= 4) {
                            System.out.println("Se necesita bandeja de 4");

                        } else {
                            System.out.println("Se necesita bandeja de 8");
                        }
                    }
                }
            } else {

                System.out.println("Que tipo de cafe has pedido" + tipoCafe);
                System.out.println("Has pedido: " + numeroCafe);
                System.out.println("El precio es: " + numeroCafe * precioIndividual);
                System.out.println("No necesitas bandeja");
            }
        }
            break;
    }
        System.out.println("No has realizado ningun pedido");


}
    }

