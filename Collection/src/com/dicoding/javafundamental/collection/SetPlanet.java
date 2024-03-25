package com.dicoding.javafundamental.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {
    public static void main(String[] args) {
        Set<String> planets = new HashSet<>();
        planets.add("mercury");
        planets.add("venus");
        planets.add("earth");
        planets.add("earth");
        planets.add("earth");
        planets.add("mars");

        System.out.println("Set Before: " + planets.size());
        for (String planet : planets) {
            System.out.println(planet);
        }

        System.out.println("");
        planets.remove("venus");

        System.out.println("Set After: " + planets.size());
        for (Iterator iterator = planets.iterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}
