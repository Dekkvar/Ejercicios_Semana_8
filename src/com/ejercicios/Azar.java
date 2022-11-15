package com.ejercicios;

public class Azar {
    public static int num(int min, int max) {
        int random = (int) (min+(Math.random()*(max-min)));

        return random;
    }
}
