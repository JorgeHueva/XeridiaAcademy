package com.xeridia.f.Objetos.ejercicios.cafeteria;



import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Arrays;

//bandeja, para llevar, array
public class pedido {
    public boolean isTakeAway;
    //final int MAX_COFFE = 3;

    //Se define el array
    private final Coffe[] coffeList;

    //CONSTRUCTORES
    public pedido(boolean isTakeAway) {
        this.coffeList = new Coffe[CoffeTypes.values().length]; //Constructor sobrecargado
        this.isTakeAway = isTakeAway;
    }

    // public pedido() {coffeList = new Coffe[MAX_COFFE];}

/*
    // CONTEO NUMERO CAFES TOTALES
    public int nCoffes(Coffe coffeList) {
        int nCoffes = 0;
        for (int i = 0; i < this.coffeList.length; i++) {
            nCoffes = nCoffes + this.coffeList[i].getNumberCoffe();
        }
        return nCoffes;
    }

    // PRECIO TOTAL pero si añades el mismo tipo cafe no sumaba
    public double priceTotal (Coffe coffeList){
        int priceTotal = 0;
        for (int i = 0; i < this.coffeList.length; i++) {
            priceTotal = priceTotal += this.coffeList[i].getPriceCoffe();
        }
        return priceTotal;
    }
*/

//METODO ADD COFFE con searchTypeCoffe
    // Llamada al metodo creado en coffe addAddCoffe que suma si ya hay pedidos cafe
    // Prueba si un tipo de cafe ya esta pedido
    public boolean searchTypeCoffe(String typeCoffe) {
        for (int i = 0; i < this.coffeList.length; i++) {
        if (this.coffeList[i] != null && this.coffeList[i].getTypeCoffe().equals(typeCoffe)) {
            return true;
        }
    }
    return false;
}
    public boolean addCoffe(Coffe coffe) {
        if (searchTypeCoffe(coffe.getTypeCoffe())) {
            int pos = this.searchTypePos(coffe.getTypeCoffe());
            if (coffe.getNumberCoffe() >= 0) {
                this.coffeList[pos].addAddCoffe(coffe.getNumberCoffe());
                this.coffeList[pos].priceTotal(coffe.getCoffePrice());
            }
            return false;
        } else {
            for (int i = 0; i < this.coffeList.length; i++) {
                if (this.coffeList[i] == null) {
                    this.coffeList[i] = coffe;
                    return true;
                }
            }
        }
        return false;
    }


    //METODO SEARCH COFFE con positionCoffe
    public Coffe searchCoffe(String typeCoffe) {
        int pos = this.searchTypePos(typeCoffe);
        if (pos == -1) return null;
        return this.coffeList[pos];
    }

    public int searchTypePos(String typeCoffe) {
        for (int i = 0; i < this.coffeList.length; i++) {
            if (this.coffeList[i] != null && this.coffeList[i].getTypeCoffe().equals(typeCoffe)) {
                return i;
            }
        }
        return -1;
    }

    //METODO REMOVE COFFE
    public boolean removeCoffe(String typeCoffe) {
        int pos = this.searchTypePos(typeCoffe);
        if (pos == -1) {
            return false;
        }
        this.coffeList[pos] = null;
        return false;
    }


    //GETTER & SETTER
    public boolean isTakeAway() {
        return isTakeAway;
    }

    public void setTakeAway(boolean takeAway) {
        isTakeAway = takeAway;
    }

    public Coffe[] getCoffeList() {
        return coffeList;
    }

    // BANDEJAS
    public String bandejas() {
        int total = 0;
        if (this.isTakeAway) {
            for (int i = 0; i < this.coffeList.length; i++) {
                if (this.coffeList[i] != null) {
                    total = total + this.coffeList[i].getNumberCoffe();
                }
            }
            float result = (float) total / 9;
            int result1 = (int) result;
            int bandejas = total - 9 * result1;

            if (result >= 1) {
                if (bandejas <= 2) {
                    return "Se necesitan " + result1 + " bandeja de 9 y una de 2";
                } else if (bandejas <= 4) {
                    return "Se necesitan " + result1 + " bandeja de 9 y una de 4";
                } else {
                    return "Se necesitan " + result1 + " bandeja de 9 y una de 9";
                }

            } else {
                if (total == 1) {
                    return "No lleva bandeja de carton";
                } else if (total == 2) {
                    return "Se necesita bandeja de 2";
                } else if (total <= 4) {
                    return "Se necesita bandeja de 4";
                } else {
                    return "Se necesita bandeja de 9";
                }
            }
        }
        return "No necesitas bandeja";
    }


    //TO STRING
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("Bandejas: " + this.bandejas() + "\nLista del pedido \n");
        for (int i = 0; i < this.coffeList.length; i++) {
            if (this.coffeList[i] == null){
            } else {
                output.append(coffeList[i]).append("\n");
            }
        }
        return  output.toString();
    }
}


