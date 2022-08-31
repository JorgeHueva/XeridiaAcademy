package com.xeridia.estructuraDeDatos.teoria.map;

public class Capital {
    private  long citizens;
    private String name;

    public Capital(long citizens, String name) {
        this.citizens = citizens;
        this.name = name;
    }

    public long getCitizens() {
        return citizens;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Capital " + " citizens=" + citizens + ", name='" + name;
    }
}
