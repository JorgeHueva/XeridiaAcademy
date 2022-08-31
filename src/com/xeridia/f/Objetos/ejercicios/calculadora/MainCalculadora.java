package com.xeridia.f.Objetos.ejercicios.calculadora;

public class MainCalculadora {
    public static void main(String[] args) {
/*
Crear una clase calculadora que contenga metodos para:
- sumar
- restar
- multiplicacion
- division
- raiz cuadrada
tanto metodo de suma como de resta deberan estar sobrecargados para aceptar 2 o 3 parametros
 */

    Calculadora c = new Calculadora();

        System.out.println(c.sumar(3,2));
        System.out.println(c.sumar(2,5,7));
        System.out.println(c.potencia(2,5,1));




    }
}
