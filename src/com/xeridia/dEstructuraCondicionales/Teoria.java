package com.xeridia.dEstructuraCondicionales;

import com.xeridia.utils.Teclado;

public class Teoria {
    public static void main(String[] args) {
////        String input = Teclado.readString();
////        System.out.println(input);
//
//        int unidadesDisponibles = Teclado.readInteger();
//        String articulo = null;
//
//       if (unidadesDisponibles >= 0 && articulo != null ) {
//           System.out.println("Buscando: ");
//           if (unidadesDisponibles == 0) {
//               System.out.println("Existencias agotadas");
//           } else if (unidadesDisponibles < 5) {
//               System.out.println("Quedan pocas unidades ");
//           } else {
//               System.out.println("Disponible para la compra");
//           }
//       } else {
//           System.out.println("Numero invalido ");
//       }

        String animal = "tigre";
        switch (animal){
            case "tigre":
            case "gato":
                System.out.println("miau");
                break;
            case "vaca":
                System.out.println("muu");
                break;
            case "perro":
                System.out.println("guau");
                break;
            default:
                System.out.println("El animal no esta contemplado");
        }

    }
}
