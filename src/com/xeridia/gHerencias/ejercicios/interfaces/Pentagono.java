package com.xeridia.gHerencias.ejercicios.interfaces;

public class Pentagono implements Poligono {
 public double apotema;
 ;
 public double base;

    public Pentagono(double apotema, double base) {
        this.apotema = apotema;
        this.base = base;
    }

    @Override
    public double getArea() {
        return 5*base*apotema/2;
    }
}
