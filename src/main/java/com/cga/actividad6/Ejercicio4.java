package com.cga.actividad6;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int primerValor = 0;
        int segundoValor = 0;
        int respuesta = 0;
        int operacionesRealizadas = 0;
        boolean respuestaCorrecta = false;

        do {

            primerValor = (int) (Math.random() * 100 + 1);
            segundoValor = (int) (Math.random() * 100 + 1);

            System.out.printf("La suma de %d + %d es igual a: ", primerValor, segundoValor);
            respuesta = sc.nextInt();

            respuestaCorrecta = (respuesta == (primerValor + segundoValor)) ? true : false;
            if (respuestaCorrecta) operacionesRealizadas++;

        } while (respuestaCorrecta);

        System.out.println("El número de operaciones correctas es: " + (operacionesRealizadas));

        sc.close();
    }
}
