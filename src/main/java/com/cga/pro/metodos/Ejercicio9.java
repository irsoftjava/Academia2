package com.cga.pro.metodos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {

        UtilesMath um = new UtilesMath();
        Scanner sc = new Scanner(System.in);
        //sc.useLocale(Locale.UK);

        int inputOK = 0;
        double op1 = 0, op2 = 0;

        // Introduce Operandos
        do {
            if (inputOK == 0) {
                try {
                    System.out.print("Introduzca el Primer Operando: ");
                    op1 = sc.nextDouble();
                    inputOK++;
                } catch (InputMismatchException ex) {
                    System.out.println("ERROR: Se espera un valor NUMÉRICO...");
                    sc.next();
                }
            }
            if (inputOK == 1) {
                try {
                    System.out.print("Introduzca el Segundo Operando: ");
                    op2 = sc.nextDouble();
                    inputOK++;
                } catch (InputMismatchException ex) {
                    System.out.println("ERROR: Se espera un valor NUMÉRICO...");
                    sc.next();
                }
            }
        } while (inputOK != 2);

        // Menú
        int opcion = 0;
        char operador = ' ';
        inputOK = 0;
        do {
            try {
                System.out.printf("%nAcaba de introducir los siguientes operadores %.2f, y %.2f%n", op1, op2);
                System.out.println("Que Operadores desea utilizar con ello?");
                System.out.print("(1) Suma, (2) Resta, (3) Multiplicación, (4) División: ");
                opcion = sc.nextInt();
                if (opcion > 0 && opcion < 5) {
                    switch (opcion) {
                        case 1: operador = '+'; break;
                        case 2: operador = '-'; break;
                        case 3: operador = '*'; break;
                        case 4: operador = '/'; break;
                    }
                    inputOK++;
                } else {
                    System.out.println("ERROR: Debe Introducir un valor comprendido entre 1 y 4...");
                    System.out.println();
                }
            } catch (InputMismatchException ex) {
                System.out.println("ERROR: Se espera un valor NUMÉRICO entre 1 y 4...");
                System.out.println();
                sc.next();
            }
        } while (inputOK == 0);

        double resultado = um.calculadora(operador, op1, op2);
        System.out.println();
        System.out.printf("Calculadora: %.2f %c %.2f = %.2f", op1, operador, op2, resultado);

        sc.close();
    }
}
