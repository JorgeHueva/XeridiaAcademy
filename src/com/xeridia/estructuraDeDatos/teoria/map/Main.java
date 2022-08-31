package com.xeridia.estructuraDeDatos.teoria.map;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // HashMap <key, value>
        HashMap <String , Capital> capitalCities = new HashMap<>();


        Capital madrid = new Capital(3000000, "Madrid");
        Capital londres = new Capital(900000, "Londres");
        Capital paris = new Capital(9000000, "Paris");

        capitalCities.put("Spain", new Capital(3000000, "Madrid"));
        capitalCities.put("UnitedKingdom", new Capital(9000000, "Londres"));
        capitalCities.put("France", new Capital(9000000, "Paris"));

        // GET CON LA KEY (para buscar)
        System.out.println(capitalCities.get("Spain"));

        capitalCities.remove("UnitedKingdom");
        System.out.println(capitalCities + " " + capitalCities.size());
        capitalCities.clear();
        System.out.println(capitalCities);

        capitalCities.put("Spain", new Capital(3000000, "Madrid"));
        capitalCities.put("UnitedKingdom", new Capital(9000000, "Londres"));
        capitalCities.put("France", new Capital(9000000, "Paris"));

        StringBuilder out = new StringBuilder();
        for (String k: capitalCities.keySet()){
            out.append("La capital de ").append(k).append(" es ").append(capitalCities.get(k).getName());
        }
        System.out.println(out);


        out = new StringBuilder();
        for (Capital v: capitalCities.values()){
            out.append(v);
        }
        System.out.println(out);
    }
}
