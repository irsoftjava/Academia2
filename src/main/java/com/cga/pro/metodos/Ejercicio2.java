package com.cga.pro.metodos;

public class Ejercicio2 {

    public static void numerosComprendidosEntre(int a, int b) {
        //int c;
        if (a == b) {
            System.out.println("Entre intervalos IGUALES no existen números enteros...");
        } else if (a > b) {
            int c = a;
            a = b;
            b = c;
        }
        System.out.printf("Números entre %d y %d%n", a, b);
        for (int i = a + 1; i < b; i++) {
            System.out.printf("%d ", i);
        }
    }

    public static void main(String[] args) {

        Ejercicio2.numerosComprendidosEntre(20, -3);
    }
}
