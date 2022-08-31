package com.xeridia.estructuraDeDatos.teoria.set;

import sun.reflect.generics.tree.Tree;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //funciona ordenandolo por el numero de hashcode
            //con TreeSet seria alfabetico

        TreeSet<String> mySet = new TreeSet<>();

       mySet.add("Spain");
       mySet.add("Uk");
       mySet.add("France");
       mySet.add("Germany");
       mySet.add("Italy");
        System.out.println(mySet);

        TreeSet<Persona> personSet = new TreeSet<>();
        personSet.add(new Persona(30, "pepe", true));
        personSet.add(new Persona(34, "jorge", true));
        personSet.add(new Persona(20, "guillermo", true));
        System.out.println(personSet);

    }
}
