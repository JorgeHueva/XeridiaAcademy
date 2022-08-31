package com.xeridia.f.Objetos.ejercicios;

public class MainFecha {
    public static void main(String[] args) {

        Fecha fechaActual = new Fecha(2070, 12, 31, 22, 15,45);
        Fecha tuFecha = new Fecha (2070, 12, 31, 2,5,40);

        Fecha fecha2 = new Fecha(30, 10, 2000);

        Persona yo = new Persona(21, "yo",true, fechaActual);
        Persona tu = new Persona(22, "tu",false, tuFecha);


        System.out.println(yo);


        System.out.println(fechaActual);
        System.out.println(tuFecha);
        System.out.println("La primera fecha es mayor que la segunda: " + fechaActual.masRecienteQue(tuFecha));

        System.out.println("Los dos estan empleados: " + yo.empleadooNo(tu));


    }
}
