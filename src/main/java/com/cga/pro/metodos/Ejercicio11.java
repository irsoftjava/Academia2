package com.cga.pro.metodos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        UtilesMath um = new UtilesMath();
        Scanner sc = new Scanner(System.in);
        double base = 0.0;
        int exponente = 0;
        int inputOK = 0;

        float x = (5.0f / 0);
        System.out.println(x);

        do {
            if (inputOK == 0) {
                System.out.print("Por favor, introduzca la base: ");
                try {
                    base = sc.nextDouble();
                    inputOK++;
                } catch (InputMismatchException ex) {
                    System.out.println("ERROR: Introduzca un valor numérico...");
                    System.out.println();
                    sc.next();
                }
            }
            if (inputOK == 1) {
                System.out.print("Por favor, introduzca el exponente: ");
                try {
                    exponente = sc.nextInt();
                    inputOK++;
                } catch (InputMismatchException ex) {
                    System.out.println("ERROR: Introduzca un valor numérico entero...");
                    System.out.println();
                    sc.next();
                }
            }
        } while (inputOK != 2);

        double respuesta = um.aLaN(base, exponente);
        System.out.printf("Respuesta: %.2f elevado a %d es: %.1f", base, exponente, respuesta);

        sc.close();
    }
}
