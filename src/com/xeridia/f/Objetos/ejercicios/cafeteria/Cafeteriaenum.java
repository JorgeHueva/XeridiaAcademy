package com.xeridia.f.Objetos.ejercicios.cafeteria;

import com.xeridia.utils.Teclado;

public class Cafeteriaenum {
    public Cafeteriaenum() {}

////METODO PARA LLEVAR
//    public boolean esParaLlevar() {
//        int takeAway;
//        boolean isTakeAway;
//
//        System.out.println("¿Desea el cafe para llevar? \n 1 SI   2 NO");
//        takeAway = Teclado.readInteger();
//        isTakeAway = takeAway == 1;
//        return isTakeAway;
//    }
//
// // IMPRIMIR MENU
//    public void impOrder (){
//         String typeCoffe = "";
//         int numberCoffe = 0;
//         double priceCoffe = 0;
//         int num = -1;
//         int cont = CoffeTypes.values().length + 1; // para que te coja el 0 del array
//         pedido pedido = new pedido(this.esParaLlevar());
//         String eliminate;
//
//
//
//         do {
//             System.out.println(generateOrder());
//             num = Teclado.readInteger();
//             if (num == 5){
//                 System.out.println(pedido);
//                 System.out.println("Ingrese el tipo de cafe que desee quitar");
//                 eliminate = Teclado.readString();
//                 pedido.removeCoffe(eliminate);
//                 num = 1;
//
//             } else if  (num > 0 && num < cont){
//                 System.out.println("Introduce numero de cafes");
//                 numberCoffe = Teclado.readInteger();
//                 // el .values entra a por los valores del enum
//                 typeCoffe = CoffeTypes.values()[num - 1].getType();
//                 priceCoffe = CoffeTypes.values()[num -1].getPrice();
//                 Coffe coffe = new Coffe(typeCoffe, numberCoffe, priceCoffe);
//                 pedido.addCoffe(coffe);
//                 pedido.bandejas();
//             }
//
//         } while (num > 0 && num < cont);
//        System.out.println(pedido);
//    }
//
//  // GENERAR MENU
//    public String generateOrder (){
//        StringBuilder out = new StringBuilder("Menu \n");
//        for (int i = 0; i < CoffeTypes.values().length; i++) {
//            out.append("[").append(i+1).append("]--").append(CoffeTypes.values()[i].getType()).append(CoffeTypes.values()[i].getPrice()).append("$").append("\n");
//        }
//        out.append("[5]-- Borrar cafes del pedido \n").append("[0] Pagar");
//        return out.toString();
//    }

}



