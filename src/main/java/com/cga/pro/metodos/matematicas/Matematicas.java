package com.cga.pro.metodos.matematicas;

public class Matematicas {

    public int suma(int a, int b) {
        return a + b;
    }
    public double suma(double a, double b) {
        return a + b;
    }
    public double suma(float a, float b) {
        return a + b;
    }


    public void imprimirTablaDeMultiplicar(int valor) {
        for (int vcc = 1; vcc <= 10; vcc++) {
            System.out.printf("%15d * %d = %d%n", valor, vcc, (valor * vcc));
        }
    }

    // Circulo
    public double perimetroDeUnCirculo(double radio) {
        // P = 2 * PI * r
        return ( 2 * Math.PI * radio);
    }

    // Generados

     public int cantidadDePares(int[] xs) {
        int cantidad = 0;
        for (int value : xs) {
            if (value % 2 == 0) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int cantidadDeImpares(int[] xs) {
        int cantidad = 0;
        for (int value : xs) {
            if (value % 2 != 0) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public static boolean esPrimo(int x) {
        if (x == 1 || x == 2)
            return true;
        else
            return (x % 2 != 0);
    }
}
