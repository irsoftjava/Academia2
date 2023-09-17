package com.cga.pro.investigacion.openbookcamp.recursiva;

import java.util.stream.IntStream;

public class Main {

    /**
     * Suma iterativa
     * @param max int
     * @return int
     */
    public static int sumaIterativa(int max) {
        int resultado = 0;

        for (int i = 0; i <= max; i++) {
            resultado += i;
        }

        return resultado;
    }

    /**
     * Recursividad por Cola o tailRecursion
     * @param numero int
     * @return int
     */
    public static int sumaRecursiva(int numero) {
        if (numero == 1) return 1;
        return numero + sumaRecursiva(numero - 1);
    }

    /**
     * Recursividad por Cabeza o headRecursion
     * @param valor int
     */
    public static void headRecursion(int valor) {
        if (valor == 0) {
            return;
        }

        headRecursion(valor - 1);
        System.out.println(valor);
    }

    public static int sumaFuncional(int numero) {
        return IntStream.rangeClosed(1, numero)
                .reduce(0, (a, b) -> a + b);
    }

    public static int factorialIterativo(int numero) {
        int resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int factorialRecursivo(int numero) {
        if (numero == 0) return 1;

        return numero * factorialRecursivo(numero - 1);
    }

    public static int factorialFuncional(int numero) {
        return IntStream.rangeClosed(1, numero)
                .reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {

        System.out.println("Suma Iterativa: " + sumaIterativa(5));
        long tiempoInicial = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sumaIterativa(5);
        }
        //System.out.println("Suma Recursiva: " + sumaRecursiva(5));
        long tiempoFinal = System.currentTimeMillis();
        System.out.println("Tiempo: " + (tiempoFinal-tiempoInicial));
        //headRecursion(5);
        System.out.println("Suma Funcional: " + sumaFuncional(5));
        System.out.println();
        System.out.println("factorialIterativo: " + factorialIterativo(5));
        System.out.println("factorialRecursivo: " + factorialRecursivo(5));
        System.out.println("factorialFuncional: " + factorialFuncional(5));
    }
}
