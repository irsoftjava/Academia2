package com.cga.pro.metodos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        UtilesMath um = new UtilesMath();
        Scanner sc = new Scanner(System.in);
        int isOK = 0;
        int n1 = 0, n2 = 0;

        do {
            if (isOK == 0) {
                try {
                    System.out.print("Por favor, introduzca el primer valor: ");
                    n1 = sc.nextInt();
                    isOK++;
                } catch (InputMismatchException ex) {
                    System.out.println("Debe introducir un valor numérico entero...");
                    System.out.println();
                    sc.next();
                }
            }
            if (isOK == 1) {
                try {
                    System.out.print("Por favor, introduzca el segundo valor: ");
                    n2 = sc.nextInt();
                    isOK++;
                } catch (InputMismatchException ex) {
                    System.out.println("Debe introducir un valor numérico entero...");
                    System.out.println();
                    sc.next();
                }
            }
        } while (isOK != 2);

        int maximo = um.maximoValor(n1, n2);

        if (maximo != 0) {
            System.out.printf("De los siguientes valores (%d, %d) el mayor es el: %d", n1, n2, maximo);
        } else {
            System.out.println("Los dos valores son iguales, debe introducir valores distintos.");
        }
    }
}
