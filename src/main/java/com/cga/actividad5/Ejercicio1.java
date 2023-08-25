package com.cga.actividad5;

/*
    Crear un programa que, dado el peso en Kilogramos y la altura en metros de una persona, calcule y muestre por pantalla
    su Índice de Masa Corporal (IMC). Este índice pretende determinar el intervalo de peso más saludable que puede tener
    una persona. El valor de este índice se calcula mediante la siguiente expresión:

                    IMC = peso / altura^2

    Se suele establecer un intervalo de 18 a 25 como saludable en personas adultas
    Utilizar el método pow() de la clase Math.
*/

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el peso en (kg): ");
        double peso = sc.nextDouble();

        System.out.print("\nIntroduzca su altura en (m): ");
        double altura = sc.nextDouble();

        double imc = peso / Math.pow(altura, 2);

        System.out.printf("Su Indice de Masa Corporal (IMC): %.2f%n", imc);

        if (imc < 18) {
            System.out.printf("Su IMC(%.2f) esta por debajo de lo establecido (18-25).", imc);
        } else if (imc > 25) {
            System.out.printf("Su IMC(%.2f) esta por encima de lo establecido (18-25).", imc);
        } else {
            System.out.printf("Su IMC(%.2f) esta dentro de los parámetros establecidos (18-25).", imc);
        }

        sc.close();
    }
}
