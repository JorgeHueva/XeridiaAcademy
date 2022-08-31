package com.xeridia.f.Objetos.ejercicios.calculadora;
import java.lang.Math.*;

public class Calculadora {



    public Calculadora() {
    }

    //SUMA

    public double sumar(double x, double y, double z) {
        return x + y + z;
    }

    public double sumar(double x, double y) {
        return x + y;
    }

    //RESTA
    public double restar(double x, double y, double z) {
        return x - y - z;
    }

    public double restar(double x, double y) {
        return x - y;
    }

    //MULTIPLICACION
    public double multipliacion(double x, double y, double z) {
        return x * y * z;
    }

    public double multipliacion(double x, double y) {
        return x * y;
    }
        // DIVISION
        public double division ( double x, double y){
            return x / y;
        }
    //RAIZ CUADRADA
    public double raiz (double x){
        return Math.sqrt(x);
    }
      //POTENCIA
    public double potencia (double x, double y) {
        return Math.pow(x, y);
    }

     public double potencia (double x, double y, double z){
            return Math.pow(Math.pow(x,y),z);

    }
    //HIPOTENUSA
    public double hipotenusa (double x, double y) {
        return Math.hypot(x, y);
    }


    }




