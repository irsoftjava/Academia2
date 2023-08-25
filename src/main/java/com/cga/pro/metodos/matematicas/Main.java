package com.cga.pro.metodos.matematicas;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Matematicas mat = new Matematicas();
        int valor = 0;
        boolean entradaCorrecta = false;

        System.out.printf("La suma de los dos valores Enteros es: %d%n", mat.suma(3, 76));
        System.out.printf("La suma de los dos valores Doubles es: %.2f%n", mat.suma(2.0D, 7.6D));
        System.out.printf("La suma de los dos valores Floats es: %.2f%n", mat.suma(4.2F, 7.6F));

        do {
            try {
                System.out.print("Introduzca un valor entre 1 y 10 para generar su Tabla de Multiplicación: ");
                valor = sc.nextInt();
                entradaCorrecta = true;
            } catch (InputMismatchException ex) {
                System.out.println("ERROR: Recuerde que el valor debe estar comprendido entre 1 y 10");
                sc.next();
            }
        } while (!entradaCorrecta);
        mat.imprimirTablaDeMultiplicar(valor);

        entradaCorrecta = false;
        double radio = 0;

        do {
            try {
                System.out.print("Introduzca el radio (r) de la Circunferencia: ");
                radio  = sc.nextDouble();
                entradaCorrecta = true;
            } catch (InputMismatchException ex) {
                System.out.println("ERROR: Recuerde que el valor debe ser numérico, preferiblemente decimal...");
                sc.next();
            }
        } while (!entradaCorrecta);

        System.out.printf("El Perímetro de la Circunferencia con radio (%.2f) es: %.2f%n", radio, mat.perimetroDeUnCirculo(radio));

        // Valores generados
        entradaCorrecta = false;
        int cantidad = 0;

        do {
            try {
                System.out.print("Cantidad de valores enteros a Generar: ");
                cantidad = sc.nextInt();
                entradaCorrecta = true;
            } catch (InputMismatchException ex) {
                System.out.println("ERROR: Recuerde que el valor debe ser numérico y entero...");
                sc.next();
            }
        } while (!entradaCorrecta);

        int valoresGenerados[] = new int[cantidad];
        int cantPrimos = 0;

        for (int vcc = 0; vcc < cantidad; vcc++) {
            valoresGenerados[vcc] = (int) (Math.random() * cantidad + 1);
            if (Matematicas.esPrimo(valoresGenerados[vcc])) cantPrimos++;
        }

        System.out.printf("Generados: %s%n", Arrays.toString(valoresGenerados));
        System.out.printf("Existen %d números Pares y %d números Impares. ", mat.cantidadDePares(valoresGenerados),
                mat.cantidadDeImpares(valoresGenerados));
        System.out.printf("Y %d números Primos.", cantPrimos);

        sc.close();
    }
}
