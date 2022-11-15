package com.ejercicios;

public class Juego {
    public static String result(int random, int guess) {
        String response = "";

        if (guess > random) {
            response = "Estás buscando un número más pequeño.";
        } else if (guess < random) {
            response = "Estás buscando un número más grande."
        } else {
            response = "Has acertado!";
        }

        return response;
    }
}
