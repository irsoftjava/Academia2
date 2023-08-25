package com.cga.actividad6;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero = -1;

        while (numero != 0) {

            System.out.print("Introduzca un número: ");
            numero = sc.nextInt();

            if(numero != 0) {
                // PAR o IMPAR
                if (numero % 2 == 0) {
                    System.out.printf("El número %d es PAR%n", numero);
                } else {
                    System.out.printf("El número %d es IMPAR%n", numero);
                }

                // POSITIVO o NEGATIVO
                if (numero > 0) {
                    System.out.printf("El número %d es POSITIVO%n", numero);
                } else {
                    System.out.printf("El número %d es NEGATIVO%n", numero);
                }

                // CUADRADO
                System.out.printf("El cuadrado de %d es: %d%n", numero, (int) Math.pow(numero, 2));
                System.out.println("");
            }
        }

        sc.close();
    }
}
