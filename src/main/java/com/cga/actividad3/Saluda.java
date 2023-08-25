package com.cga.actividad3;

import java.util.Scanner;

public class Saluda {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca su nombre, por favor: ");
        String nombre = sc.nextLine();

        System.out.print("Introduzca sus apellidos, por favor: ");
        String apellidos = sc.nextLine();

        System.out.println("Mi nombre es " + nombre + " " + apellidos);

        sc.close();
    }
}
