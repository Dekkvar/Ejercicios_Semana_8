package com.ejercicios;

public class E_S {
    public static String str (String str) {
        Input input = new Input();
        System.out.println("Introduzca una cadena de caracteres:");
        String newStr = input.text();
        return newStr;
    }

    public static int num (String str) {
        Input input = new Input();
        System.out.println("Introduzca una valor entero:");
        int newNum = input.num();
        return newNum;
    }

    public static void printStr (String str) {
        System.out.println(str);
    }
}
