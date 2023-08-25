package com.cga.actividad7;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Le dice a la clase Scanner que debe utilizar . en los decimales
        sc.useLocale(Locale.UK);

        double[] valoresIntroducidos = new double[5];
        double valor = 0;

        for (int vcc = 0; vcc < valoresIntroducidos.length; vcc++) {
            System.out.printf("Introduzca valor #%d: ", vcc + 1);
            valor = sc.nextDouble();

            valoresIntroducidos[vcc] = valor;
        }

        System.out.println("Valores Introducidos: " + Arrays.toString(valoresIntroducidos));

        sc.close();
    }
}
