package com.spartaglobal.java.lessons;

public class Enums {

    public enum Continents {
        EUROPE,
        ASIA,
        AFRICA,
        OCEANIA,
        NORTH_AMERICA,
        SOUTH_AMERICA,
        ANTARCTICA
    }

    public static void enumContinentsInfo() {
        Continents continents = Continents.EUROPE;
        // continents = 2; not allowed, must use Continents.something (dot notation)
        continents = Continents.AFRICA;
        continents = Continents.NORTH_AMERICA;
        if (continents.equals(Continents.NORTH_AMERICA)){
            System.out.println(continents);
        }
        System.out.println(Continents.EUROPE == Continents.ASIA);
        System.out.println(Continents.ASIA == Continents.ASIA);
        System.out.println(Continents.ANTARCTICA.ordinal());

    }
}
