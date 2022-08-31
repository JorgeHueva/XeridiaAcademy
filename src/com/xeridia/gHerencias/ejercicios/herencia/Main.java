package com.xeridia.gHerencias.ejercicios.herencia;

public class Main {
    public static void main(String[] args) {

        Cuadrado cuadrado = new Cuadrado(10);
        cuadrado.getArea();
        System.out.println("Area cuadrado " + cuadrado.getArea());

        Triangulo triangulo = new Triangulo(10,5 );
        System.out.println("Area triangulo " + triangulo.getArea());

        Pentagono pentagono = new Pentagono(10, 5);
        System.out.println("Area pentagono " + pentagono.getArea());

    }
}
