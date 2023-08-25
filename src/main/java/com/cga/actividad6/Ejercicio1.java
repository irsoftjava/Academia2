package com.cga.actividad6;

/*
*   Realizar un juego para adivinar un número. Para ello generar un
    número entero entre 1 y 100 de manera aleatoria, y luego ir pidiendo
    números indicando “mayor” o “menor” según sea mayor o menor con
    respecto al número generado de manera aleatoria. El proceso
    termina cuando el usuario acierta el número.
    Una vez acertado el número, debe imprimirse un mensaje indicando
    que el usuario ha acertado el número y debemos imprimir también el
    número de intentos que hemos hecho.
* */

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int valorGenerado = (int) (Math.random() * 100 +1);
        int respuesta = 0;
        int intentos = 0;

        do {
            System.out.print("Introduzca un número ente 1 y 100: ");
            respuesta = sc.nextInt();

            if (respuesta < valorGenerado) {
                System.out.println("El valor generado es Mayor que su respuesta.");
            } else if (respuesta > valorGenerado) {
                System.out.println("El valor generado es Menor que su respuesta.");
            }
            intentos++;
            System.out.println("");
        } while (respuesta != valorGenerado);

        System.out.println("El número de intentos para adivinar el número secreto ha sido de: " + intentos);

        sc.close();
    }
}
