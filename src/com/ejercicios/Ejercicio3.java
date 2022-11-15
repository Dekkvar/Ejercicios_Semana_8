package com.ejercicios;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        Input input = new Input();
        Azar random = new Azar();
        System.out.println("Introduzca la cantidad de datos:");
        int dataLenght = input.num();
        System.out.println("\nIntroduzca un valor mínimo para los datos:");
        int min = input.num();
        System.out.println("\nIntroduzca un valor máximo para los datos:");
        int max = input.num();

        int [] dataArray = new int[dataLenght];

        for (int i = 0; i < dataLenght; i++) {
            int num = random.num(min, max);
            dataArray[i] = num;
        }

        System.out.println("\n" + Arrays.toString(dataArray));
    }
}
