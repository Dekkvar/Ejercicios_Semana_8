package com.ejercicios;

public class Juego {
    public static void main(String[] args) {
        int random = (int) (Math.random()*100+1);

        System.out.println("Intente adivinar el número entre 1 y 100:");
        int guess = 0;
        while (guess != random) {
            System.out.println("\nIntroduce un número:");
            Input input = new Input();
            guess = input.num();
            if (guess == random) {
                System.out.println("Has acertado!");
                break;
            }
            System.out.println("Te has equivocado. ¿Deseas seguir intentándolo?");
            Input inputText = new Input();
            String option = inputText.text();
            if (option.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}
