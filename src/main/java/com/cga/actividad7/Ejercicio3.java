package com.cga.actividad7;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int cantidad = 0;
        int valor;

        System.out.print("Cuantos números desea Introducir: ");
        cantidad = sc.nextInt();

        int[] valores = new int[cantidad];

        for (int vcc = 0; vcc < cantidad; vcc++) {
            System.out.printf("Introduzca el %d valor: ", (vcc + 1));
            valor = sc.nextInt();

            valores[((cantidad - 1) - vcc)] = valor;
        }

        System.out.println("Valores en Orden Inverso: " + Arrays.toString(valores));

        sc.close();
    }
}
