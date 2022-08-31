package com.xeridia.gHerencias.teoria.clasesAbstractas;

abstract class Animal {
    //Los metodos abstractos son definiciones

    protected  String name;
    protected int numeroPatas;

    public Animal(String name, int numeroPatas) {
        this.name = name;
        this.numeroPatas = numeroPatas;
    }

    public Animal(String name) {
        this.name = name;
    }

    public abstract void animalSound();
    public abstract void sayName ();
    public void sleep(){
        System.out.println("zzz");
    }



}
