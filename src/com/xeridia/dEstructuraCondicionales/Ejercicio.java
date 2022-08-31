package com.xeridia.dEstructuraCondicionales;

import com.xeridia.utils.Teclado;

/*
    Crear las siguientes variables para un pedido de un café.
        - El tipo de cafe
        - El numero de cafes
        - El precio individual
        - Si es o no para llevar
        - Si hay que poner bandeja de carton o no
        - En caso de que haya que poner bandeja, de que tamaño (2, 4, 8)
    Como maximo se pueden pedir 8 cafes, si se pide solo un cafe, no hay bandeja
    Una vez creada las variables, mostrar por consola la siguiente informacion:
        - El tipo de cafe
        - Cuantas tazas se han pedido
        - El precio total (tazas * precio)
        - Si es o no para llevar, en caso de que sea para llevar y sean mas de 1 cafe, poner el tamaño de la bandeja, si es solo 1 cafe, indicar que no lleva bandeja
*/
public class Ejercicio {
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
        boolean carton = llevar;


            if (llevar) {
                if (numeroCafe > 8) {
                    System.out.println("Que tipo de cafe has pedido" + tipoCafe);
                    System.out.println("Has pedido: " + numeroCafe);
                    System.out.println("El precio es: " + numeroCafe * precioIndividual);


                    // Quitar los decimales a la division
                    float result = (float) numeroCafe/8;
                    int result1 = (int) result;
                    int bandejas = numeroCafe - 8*result1;
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
                        System.out.println("Necesitas bandeja de carton" + carton);
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
                System.out.println("El precio es: " + numeroCafe*precioIndividual);
                System.out.println("No necesitas bandeja");
            }
        }
        }
    }

