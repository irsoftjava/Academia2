package com.cga.pro.investigacion.thread;

public class Main {

    // Todas las interfaces en Java, absolutamente todas las que tengan un solo método
    // son compatibles con Lambdas.
    // Y por eso mismo, por ser compatibles con la programación funcional se les puede
    // agregar notación opcional @FunctionalInterface, que está desde Java 8.

    @FunctionalInterface
    interface Suma {
        Integer sumarDosNumeros(Integer a, Integer b);
    }
    public static void main(String[] args) {

        // Implementado con una clase, en este caso la clase Hilo
        Thread hilo = new Thread(new Hilo());
        hilo.start();

        // Implementado con una clase anónima, en este cado directamente con la clase Runnable
        Thread hilo2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hola otra vez...");
            }
        });
        hilo2.start();

        // Implementado mediante una lambda
        Thread hilo3 = new Thread(
                () -> System.out.println("Hola desde una Lambda...")
        );
        hilo3.start();

        // Implementación de la interfaz Suma
        // Esto es una Lambda
        Suma suma = (a, b) -> a + b;
        System.out.println(suma.sumarDosNumeros(1969, 54));
    }
}
