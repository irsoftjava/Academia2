package com.cga.actividad3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su nombre, por favor: ");
        String nombre = sc.nextLine();

        System.out.print("Introduzca se edad, por favor: ");
        int edad = sc.nextInt();

        sc.nextLine();

        System.out.print("Que módulo estudias?: ");
        String modulo = sc.nextLine();

        System.out.println("Mi nombre es " + nombre);
        System.out.println("Tengo " + edad + " años de edad.");
        System.out.println("Estudio programación en el módulo de " + modulo);

        sc.close();
    }
}
