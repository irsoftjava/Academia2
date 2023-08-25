package com.cga.pro.metodos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {

        UtilesMath um = new UtilesMath();
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 0;
        int inputOK = 0;

        do {
            if (inputOK == 0) {
                System.out.print("Por favor, introduzca el primer número: ");
                try {
                    a = sc.nextInt();
                    inputOK++;
                } catch (InputMismatchException ex) {
                    System.out.println("ERROR: Introduzca un valor numérico...");
                    System.out.println();
                    sc.next();
                }
            }
            if (inputOK == 1) {
                System.out.print("Por favor, introduzca el segundo número: ");
                try {
                    b = sc.nextInt();
                    inputOK++;
                } catch (InputMismatchException ex) {
                    System.out.println("ERROR: Introduzca un valor numérico entero...");
                    System.out.println();
                    sc.next();
                }
            }
        } while (inputOK != 2);

        int respuesta = um.mcd(a, b);
        System.out.printf("El mcd(%d,%d) es: %d%n", a, b, respuesta);

        sc.close();
    }
}
