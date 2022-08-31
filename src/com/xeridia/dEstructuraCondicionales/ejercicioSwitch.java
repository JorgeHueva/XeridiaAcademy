package com.xeridia.dEstructuraCondicionales;

import com.xeridia.utils.Teclado;

public class ejercicioSwitch {
    public static void main(String[] args) {
        //pedir un mes del año y mostrar si tiene 30,31 o 28 dias

        System.out.println("Dime un mes del año");
        String mes = Teclado.readString();
                switch (mes) {
                    case "enero":
                    case "marzo":
                    case"mayo":
                    case "julio":
                    case "agosto":
                    case "octubre":
                    case "diciembre":
                        System.out.println("El mes tiene 31 dias");
                        break;
                    case "febrero":
                        System.out.println("El mes tiene 28 dias");
                        break;

                    case "abril":
                    case"junio":
                    case "septiembre":
                    case "noviembre":
                        System.out.println("El mes tiene 30 dias");
                        break;
                    default:
                        System.out.println("No existe");
                }



    }
}
