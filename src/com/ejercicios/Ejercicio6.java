package com.ejercicios;

public class Ejercicio6 {
    public static void main(String[] args) {
        int random = (int) (Math.random()*100+1);
        int attempts = 0;

        System.out.println("Tienes 5 intentos para adivinar el número entre 1 y 100:");

        do {
            System.out.println("Introduzca un número:");
            Input input = new Input();
            int guess = input.num();
            Juego juego = new Juego();
            String response = juego.result(random, guess);
            attempts++;
            if (response.equals("Has acertado!")) {
                System.out.println(response);
                break;
            } else if (attempts == 5) {
                System.out.println("Has perdido.");
                System.out.println("El número era el " + random + ".");
            } else {
                System.out.println(response);
            }
        } while (attempts < 5);
    }
}
