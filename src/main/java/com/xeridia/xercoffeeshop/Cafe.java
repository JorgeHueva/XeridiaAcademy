package com.xeridia.xercoffeeshop;

import java.util.Objects;

public class Cafe {
    private String typeCoffe;
    private int numberCoffe;
    private double priceCoffe;
    private double coffePrice;


//    public Coffe(String typeCoffe, int numberCoffe, double priceCoffe) {
//        this.typeCoffe = typeCoffe;
//        this.numberCoffe = numberCoffe;
//        this.coffePrice = priceCoffe;
//        this.priceCoffe = nuevoPrecio(priceCoffe);
//    }

//    public double nuevoPrecio (double priceCoffe){
//        return this.priceCoffe = priceCoffe * numberCoffe;
//    }
//    public void subeCafes (int cantidad){
//        int suma = 0;
//        suma = numberCoffe + cantidad;
//        this.numberCoffe = suma;
//    }
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
    public void setCoffePrice(double coffePrice) {
        this.coffePrice = coffePrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cafe)) return false;
        Cafe coffe = (Cafe) o;
        return getNumberCoffe() == coffe.getNumberCoffe() && Double.compare(coffe.getPriceCoffe(), getPriceCoffe()) == 0 && Double.compare(coffe.getCoffePrice(), getCoffePrice()) == 0 && Objects.equals(getTypeCoffe(), coffe.getTypeCoffe());
    }

    @Override
    public String toString() {
        return
                " tipo:'" + typeCoffe + ",\n" +
                        " numero:" + numberCoffe + ",\n" +
                        " precio:" + priceCoffe;
    }
}
