package com.cga.actividad5;

/*
*   Tenemos dos jugadores y dos dados. El primer jugador realiza su tirada y lanza los dados. Posteriormente,
*   el segundo jugador realiza su tirada y lanza de nuevo los dados. Mostrar la tirada más alta (suma de los dos dados)
*   de las dos.
*   Cada dado puede tomar valores enteros comprendidos entre 1 y 6. El valor de cada uno de los dados ha de calcularse
*   de manera aleatoria utilizando el método Math.random().
*
*   Opcional: A parte de indicar cuál es la tirada más alta, indicar qué jugador ha realizado la tirada más alta,
*   si el jugador 1 o el jugador 2.
*   Opcional: Calcular la media de los 4 dados. Redondear la media a un número entero.
* */

public class Ejercicio7 {

    public static void main(String[] args) {

        int[] valores = new int[4];

        valores[0] = (int)(Math.random() * 6 + 1);
        valores[1] = (int)(Math.random() * 6 + 1);
        valores[2] = (int)(Math.random() * 6 + 1);
        valores[3] = (int)(Math.random() * 6 + 1);

        int jug1 = valores[0] + valores[1];
        int jug2 = valores[2] + valores[3];

        System.out.println("Jugador #1 hace su lanzamiento:");
        System.out.println("Dado #1: " + valores[0]);
        System.out.println("Dado #2: " + valores[1]);
        System.out.println("Jugador #2 hace su lanzamiento:");
        System.out.println("Dado #1: " + valores[2]);
        System.out.println("Dado #2: " + valores[3]);
        System.out.println("");

        if(jug1 > jug2) {
            System.out.println("La tirada mas alta es: " + jug1);
            System.out.println("El ganador es el jugador #1");
        } else if(jug1 < jug2) {
            System.out.println("La tirada mas alta es: " + jug2);
            System.out.println("El ganador es el jugador #2");
        } else {
            System.out.println("Existe un EMPATE entre el Jugador #1 y el Jugador #2");
        }

        int media = (jug1 + jug2) / 4;
        System.out.printf("La Media de los 4 dados es: %d", media);
    }
}
