package com.xeridia.f.Objetos.ejercicios.cafeteria;

public class Coffe {
    private String typeCoffe;
    private int numberCoffe;
    private double priceCoffe;

    //Variable para añadir un cafe del mismo tipo y te lo sume
    private double coffePrice;


    //CONSTRUCTOR
    public Coffe(String typeCoffe, int numberCoffe, double priceCoffe) {
        this.typeCoffe = typeCoffe;
        this.coffePrice = priceCoffe;
        this.numberCoffe = numberCoffe;
        this.priceCoffe = priceTotal(priceCoffe);
    }
    //Metodo para precio total
    public double priceTotal (double priceCoffe){
        if (priceCoffe == 1.50) {
            this.priceCoffe = 1.50*numberCoffe;
        } else if (priceCoffe == 1.60){
            this.priceCoffe = 1.60*numberCoffe;
        } else if(priceCoffe == 1.40){
            this.priceCoffe = 1.40*numberCoffe;
        }else {
            this.priceCoffe = 1.20*numberCoffe;
        }
        return this.priceCoffe;
    }

// ADD para llevar a pedido, donde se añaden mas cafes
    public void addAddCoffe (int cantidad){
        int suma;
        suma = numberCoffe + cantidad;
        this.numberCoffe = suma;
    }
// GETTER & SETTER
    public String getTypeCoffe() {
        return typeCoffe;
    }

    public void setTypeCoffe(String typeCoffe) {
        this.typeCoffe = typeCoffe;
    }

    public int getNumberCoffe() {
        return numberCoffe;
    }

    public void setNumberCoffe(int numberCoffe) {
        this.numberCoffe = numberCoffe;
    }

    public double getPriceCoffe() {
        return priceCoffe;
    }

    public void setPriceCoffe(double priceCoffe) {
        this.priceCoffe = priceCoffe;
    }

    public double getCoffePrice() {
        return coffePrice;
    }

    public void setCoffePrice(int coffePrice) {
        this.coffePrice = coffePrice;
    }

   // TO STRING
    @Override
    public String toString() {
        return
                "Type Coffe: " + typeCoffe  + "\n"+
                "Number Coffe = " + numberCoffe + "\n"+
                "Price Coffe = " + priceCoffe +"\n"

                ;
    }
}
