package com.cga.actividad6;

public class Ejercicio15 {

    public static void main(String[] args) {

        final int CANTIDAD = 100;
        double numeroGenerado = 0;
        double mayorNumero = -1;
        double menorNumero = 100;
        double totalDeNumerosGenerados = 0;
        double mediaDeNumerosGenerados = 0;

        for(int i = 0; i < CANTIDAD; i++) {
            numeroGenerado = Math.random();

            // Mayor numero generado
            if(numeroGenerado > mayorNumero) mayorNumero = numeroGenerado;

            // Menor numero generado
            if(numeroGenerado < menorNumero) menorNumero = numeroGenerado;

            // Total de numeros generados
            totalDeNumerosGenerados += numeroGenerado;
        }

        mediaDeNumerosGenerados = totalDeNumerosGenerados / CANTIDAD;

        System.out.printf("Informe sobre los %d números generados%n%n", CANTIDAD);
        System.out.println("El mayor número generado fue: " + mayorNumero);
        System.out.println("El menor número generado fue: " + menorNumero);
        System.out.println("La suma de todos los números generados es: " + totalDeNumerosGenerados);
        System.out.println("La media de los números generados es: " + mediaDeNumerosGenerados);
    }
}
