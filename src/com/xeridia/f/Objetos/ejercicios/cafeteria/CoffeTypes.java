package com.xeridia.f.Objetos.ejercicios.cafeteria;

enum CoffeTypes {

    SOLO ("Cafe solo",  1.50),
    CONLECHE("Cafe con leche",  1.60),
    CORTADO("Cafe cortado",  1.40),
    DESCAFEINADO ("Cafe descafeinado", 1.20)
    ;

    private String type;
    private double price;

    CoffeTypes(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }
}


