package com.cga.actividad6;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un Número: ");
        int fin = sc.nextInt();

        for(int i = 1; i <= fin; i++) {
            System.out.printf("%d ", i);
        }

        sc.close();
    }
}
