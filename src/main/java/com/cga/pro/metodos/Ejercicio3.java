package com.cga.pro.metodos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Cilindro cilindro = new Cilindro();
        Scanner sc = new Scanner(System.in);

        boolean isOK = false;
        int opcion = 0;

        do {
            System.out.println("======== Menú Cilindro ==========");
            System.out.println("1.- Calculo del Area de un Cilindro.");
            System.out.println("2.- Calculo del Volumen de un Cilindro.");
            System.out.println("3.- Salir.");
            System.out.print("Elija su Opción: ");

            try {
                opcion = sc.nextInt();
                isOK = true;
            } catch (InputMismatchException ex) {
                System.out.printf("Por favor, elija unas de las siguientes opciones (1, 2 o 3)...%n%n");
                sc.next();
            }

        } while (!isOK);

        int datosOK = 0;
        double radio = 0;
        double altura = 0;

        if (opcion != 3) {
            System.out.println();
            do {
                if (datosOK == 0) {
                    try {
                        System.out.print("Introduzca el radio (r) del Cilindro: ");
                        radio = sc.nextDouble();
                        datosOK++;
                    } catch (InputMismatchException ex) {
                        System.out.println("ERROR: Se espera un valor NUMÉRICO...");
                        sc.next();
                    }
                }
                if (datosOK == 1) {
                    try {
                        System.out.print("Introduzca la altura (h) del Cilindro: ");
                        altura = sc.nextDouble();
                        datosOK++;
                    } catch (InputMismatchException ex) {
                        System.out.println("ERROR: Se espera un valor NUMÉRICO...");
                        sc.next();
                    }
                }

            } while (datosOK != 2);

            if (opcion == 1)
                cilindro.calculaAreaVolumenCilindro(1, radio, altura);
            else if (opcion == 2)
                cilindro.calculaAreaVolumenCilindro(2, radio, altura);
        }

        System.out.println();
        System.out.println("Hasta pronto, Gracias...");

        sc.close();
    }
}
