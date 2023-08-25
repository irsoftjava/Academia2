package com.cga.actividad6;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int nota = 0;

        do {
            System.out.print("Introduzca la Nota del Alumno: ");
            nota = sc.nextInt();
        } while (nota < 1 || nota > 10);

        switch (nota) {
            case 0, 1, 2, 3, 4: {
                System.out.println("Insuficiente...");
                break;
            }
            case 5: {
                System.out.println("Suficiente...");
                break;
            }
            case 6: {
                System.out.println("Bien...");
                break;
            }
            case 7, 8: {
                System.out.println("Notable...");
                break;
            }
            case 9, 10: {
                System.out.println("Sobresaliente...");
                break;
            }
        }
    }
}
