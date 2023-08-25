package com.cga.actividad6;

import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Introduzca el primer número: ");
        int numero1 = sc.nextInt();
        System.out.print("Introduzca el segundo número: ");
        int numero2 = sc.nextInt();
        System.out.print("Introduzca el tercer número: ");
        int numero3 = sc.nextInt();

        if (numero1 > numero2 && numero1 > numero3) {
            a = numero1;
            if (numero2 > numero3) {
                b = numero2;
                c = numero3;
            } else {
                b = numero3;
                c = numero2;
            }
        } else if (numero2 > numero1 && numero2 > numero3) {
            a = numero2;
            if (numero1 > numero3) {
                b = numero1;
                c = numero3;
            } else {
                b = numero3;
                c = numero1;
            }
        } else {
            a = numero3;
            if (numero1 > numero2) {
                b = numero1;
                c = numero2;
            } else {
                b = numero2;
                c = numero1;
            }
        }

        System.out.printf("Ordenados de Mayor a menor: %d, %d, %d", a, b, c);

        sc.close();
    }
}
