package com.cga.actividad6;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int edad = 1;
        int totalEdades = 0;
        int mediaDeEdades = 0;
        int cantidadAlumnos = 0;
        int mayoresDeEdad = 0;

        while (edad > 0) {
            System.out.printf("Introduzca la Edad del Alumno #%d: ", cantidadAlumnos + 1);
            edad = sc.nextInt();

            if(edad > 0) {
                totalEdades += edad;
                if (edad >= 18) mayoresDeEdad++;
                cantidadAlumnos++;
            }
        }

        mediaDeEdades = totalEdades / cantidadAlumnos;

        System.out.println("La suma de todas las Edades es: " + totalEdades);
        System.out.println("La media de todas las Edades es: " + mediaDeEdades);
        System.out.println("Número de Alumnos: " + cantidadAlumnos);
        System.out.println("Mayores de Edad: " + mayoresDeEdad);

        sc.close();
    }
}
