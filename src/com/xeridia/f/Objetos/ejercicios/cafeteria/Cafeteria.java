//package com.xeridia.f.Objetos.ejercicios.cafeteria;
//
//import com.xeridia.utils.Teclado;
//
//public class Cafeteria {
//    public Cafeteria(){}
//
//public void menuPedido() {
//    String typeCoffe = "";
//    int numberCoffe = 0;
//    int priceCoffe = 0;
//    int num = 0;
//    boolean isTakeAway;
//    int takeAway;
//    String eliminateCoffe;
//
//    System.out.println("Es para llevar?: 1 SI/ 2 NO");
//    takeAway = Teclado.readInteger();
//    isTakeAway = takeAway == 1;
//
//    pedido pedido = new pedido(isTakeAway);
//
//
//    do {
//        System.out.println("Menu: " + " \n" +
//                "[1] Cafe solo con precio 1.50 " + "\n" +
//                "[2] Cafe con leche con precio 1.60" + "\n" +
//                "[3] Cafe cortado con precio 1.40" + "\n" +
//                "[4] Borras un pedido" + "\n" +
//                "[0] Pagar" + "\n");
//
//        num = Teclado.readInteger();
//        switch (num) {
//            case 1:
//            case 2:
//            case 3:
//                System.out.println("Introduce el numero de cafes: ");
//                numberCoffe = Teclado.readInteger();
//                Coffe coffe = new Coffe(CoffeTypes.values()[num - 1].getType(), numberCoffe, CoffeTypes.values()[num - 1].getPrice());
//                pedido.addCoffe(coffe);
//                break;
//            case 4:
//                System.out.println(pedido);
//                System.out.println("Ingrese el tipo de cafe que desea borrar(Cafe solo,Cafe con leche,Cafe cortado )");
//                eliminateCoffe = Teclado.readString();
//                pedido.removeCoffe(eliminateCoffe);
//                break;
//            case 0:
//                System.out.println("Gracias, su pedido se ha realizado " + "\n");
//                System.out.println(pedido);
//                System.exit(1);
//                break;
//
//
//            default:
//                System.out.println("El numero es incorrecto ");
//        }
//
////        Coffe coffe = new Coffe(typeCoffe, numberCoffe, priceCoffe);
////        pedido.addCoffe(coffe);
//        pedido.bandejas();
//
//
//
//    } while (num > 0);
//}
//}







