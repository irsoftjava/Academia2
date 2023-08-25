package com.cga.pro.metodos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        UtilesMath um = new UtilesMath();
        Scanner sc = new Scanner(System.in);
        boolean isOK = false;
        int valorABuscar = 0;

        do {
            System.out.print("Por favor, introduzca un número: ");
            try {
                valorABuscar = sc.nextInt();
                isOK = true;
            } catch (InputMismatchException ex) {
                System.out.println("ERROR: Solo se admiten valores numéricos...");
                System.out.println();
                sc.next();
            }
        } while (!isOK);

        System.out.println();
        System.out.printf("El %d enésimo valor de la serie Fibonacci es: %d", valorABuscar, um.enesimoTerminoFibonacci(valorABuscar));

        sc.close();
    }
}
