package com.cga.actividad6;

import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numero = 0;

        do {
            System.out.print("Introduzca un número: ");
            numero = sc.nextDouble();

            if(numero > 0) {
                System.out.println("El número es POSITIVO.");
            } else if(numero < 0){
                System.out.println("El número es NEGATIVO.");
            }
            System.out.println("");
        } while (numero != 0);

        sc.close();
    }
}
