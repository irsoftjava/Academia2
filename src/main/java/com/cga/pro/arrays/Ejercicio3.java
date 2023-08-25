package com.cga.pro.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    public static int tryInputInt(Scanner sc, String msg) {
        int inputInt = 0;
        boolean isOK = false;

        do {
            try {
                System.out.print(msg);
                inputInt = sc.nextInt();
                isOK = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debe introducir un valor numérico entero...");
                System.out.println();
                sc.next();
            }
        } while (!isOK);

        return inputInt;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean inputOK = false;
        int cantidad = 0;

        do {
            try {
                System.out.print("Cuantos números deseas introducir?: ");
                cantidad = sc.nextInt();
                inputOK = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR: Debe introducir un valor entero...");
                System.out.println();
                sc.next();
            }
        } while (!inputOK);

        int numeros[] = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            String msg = String.format("Introduzca el %d valor entero: ", i + 1);
            numeros[(cantidad - 1) - i] = tryInputInt(sc, msg);
        }

        System.out.println();
        for (int i = 0; i < cantidad; i++) {
            System.out.printf("%d ", numeros[i]);
        }

        sc.close();
    }
}
