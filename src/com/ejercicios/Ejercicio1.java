package com.ejercicios;

public class Ejercicio1 {
    public static void main(String[] args) {
        String [] films = new String[5];
        Input input = new Input();

        films = array(films, input);

        String index = response(films, input);

        System.out.println(index);
    }

    public static String[] array(String [] array, Input input) {
        System.out.println("Introduzca sus 5 películas favoritas:");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduzca la " + (i + 1) + "ª película:");
            String film = input.text();
            array[i] = film;
        }

        return array;
    }

    public static String response(String [] array, Input input) {
        System.out.println("¿Desea ver los datos guardados? [si/no]");
        String option = input.text();
        while (option.equalsIgnoreCase("si")) {
            System.out.println("¿A qué película desea acceder? [1,2,3,4,5]");
            int select = input.num();
            if (select >= 1 && select <= 5) {
                System.out.println("La película " + array[select - 1] + " se encuentra en el índice " + (select - 1) + " del array.\n");
                System.out.println("¿Desea consultar otra película? [si/no]");
            } else {
                System.out.println("Error: Ha seleccionado un valor fuera del rango.\n");
                System.out.println("¿Desea consultar otra película? [si/no]");
            }
            Input exit = new Input();
            option = exit.text();
        }
        String despedida = "Hasta pronto!";
        return despedida;
    }
}
