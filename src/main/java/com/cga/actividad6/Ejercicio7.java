package com.cga.actividad6;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el primer número: ");
        double numero1 = sc.nextDouble();
        System.out.print("Introduzca el segundo número: ");
        double numero2 = sc.nextDouble();

        if(numero1 == numero2) {
            System.out.println("Los números son iguales");
        } else {
            System.out.println("Los números no son iguales");
        }

        sc.close();
    }
}
