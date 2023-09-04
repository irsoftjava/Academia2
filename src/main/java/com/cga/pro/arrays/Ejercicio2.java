package com.cga.pro.arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio2 {

    public static double tryInputDouble(Scanner sc, String msg) {
        double inputDouble = 0.0;
        boolean isOK = false;

        do {
            try {
                System.out.print(msg);
                inputDouble = sc.nextDouble();
                isOK = true;
            } catch (InputMismatchException e) {
                System.out.println();
                System.out.println("ERROR: Debe introducir un valor numérico decimal");
                sc.next();
            }
        } while (!isOK);

        return inputDouble;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double numeros[] = new double[5];
        int cantidad = 5;

        for (int i = 0; i < cantidad; i++) {
            String msg = String.format("Introduzca el %d valor decimal: ", i + 1);
            numeros[i] = tryInputDouble(sc, msg);
        }

        System.out.println();
        for (int i = 0; i < cantidad; i++) {
            System.out.printf("%.2f ", numeros[i]);
        }

        //System.out.println(Arrays.toString(numeros));

        sc.close();
    }
}
