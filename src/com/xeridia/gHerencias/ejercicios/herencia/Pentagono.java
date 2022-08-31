package com.xeridia.gHerencias.ejercicios.herencia;

public class Pentagono extends Poligono {
    private int perimetro;
    private int apotema;

    public Pentagono(int perimetro, int apotema) {
        this.perimetro = perimetro;
        this.apotema = apotema;
    }

    public double getArea (){
        return perimetro*apotema;

    }

}
