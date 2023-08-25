package com.cga.actividad6;

import java.util.Scanner;

public class Ejercicio8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        double numero1 = sc.nextDouble();
        System.out.print("Introduzca el segundo número: ");
        double numero2 = sc.nextDouble();

        if(numero1 > numero2) {
            System.out.printf("%f es mayor que %f", numero1, numero2);
        } else {
            System.out.printf("%f es mayor que %f", numero2, numero1);
        }

        sc.close();
    }
}
