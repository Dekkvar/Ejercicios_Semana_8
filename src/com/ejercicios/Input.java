package com.ejercicios;

import java.util.Scanner;

public class Input {
    Scanner input = new Scanner(System.in);

    public String text() {
        String str = input.nextLine();
        return str;
    }

    public int num() {
        int num = input.nextInt();
        return num;
    }
}
