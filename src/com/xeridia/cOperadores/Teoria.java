package com.xeridia.cOperadores;

import com.xeridia.aEstructuraBasica.Main;

public class Teoria {
    public static void main(String[] args) {
        int x = 5;
        x += 2;
        System.out.println(x);

        x *=3;
        System.out.println(x);

        x ++;
        System.out.println(x);

        x --;
        System.out.println(x);

        //Operadores booleanos

        boolean esRojo = false;
        boolean esGamaAlta = true;
        boolean esDeportivo = true;

        boolean esRojoYDeportivo = esRojo && esDeportivo;
        boolean esRojoODeportivo = esRojo || esDeportivo;
        boolean esGamaBaja = !esGamaAlta;

        System.out.println("Rojo y deportivo: " + esRojoYDeportivo);
        System.out.println("Rojo o deportivo: " + esRojoODeportivo);
        System.out.println("Es gama baja: " + esGamaBaja);

        // Operadores de comparación

        int edadJugador1 = 35;
        int edadJugador2 = 16;

        int puntosJugador1 = 5;
        int puntosJugador2 = 5;

        boolean esJ1MayorDeEdad = edadJugador1 >= 18;
        boolean tieneJ2TieneEdadcorrecta = (edadJugador2 >= 10) && (edadJugador2 <= 99);

        boolean tienenDistintaEdad = edadJugador1 != edadJugador2;
        boolean hayEmpate = puntosJugador1 == puntosJugador2;

        System.out.println("El jugador 1 es mayor de edad " + esJ1MayorDeEdad);
        System.out.println("El jugador 2 tiene la edad correcta: " + tieneJ2TieneEdadcorrecta);
        System.out.println("Los jugadores tienen distinta edad: " + tienenDistintaEdad);
        System.out.println("Hay empate en los puntos: " + hayEmpate);



    }
}
