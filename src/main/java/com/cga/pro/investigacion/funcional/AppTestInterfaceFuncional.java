package com.cga.pro.investigacion.funcional;

import com.cga.pro.investigacion.funcional.inter.MyFunctionalInterface;

public class AppTestInterfaceFuncional {

    public static void doSomethingTraditional() {
        // Programación Orientada a Objetos
        var instanciaTux = new Tux();

        System.out.println(
                instanciaTux.doSomeThing("Que divertida es la programación funcional.")
        );
    }

    public static void doSomethingAnonima() {
        // Implementación basada en una Clase anónima
        MyFunctionalInterface duke = new MyFunctionalInterface() {
            @Override
            public String doSomeThing(String param) {
                return "Hola soy Duke, y recibí el siguiente parámetro: " + param;
            }
        };

        System.out.println(duke.doSomeThing("Clase anónima."));
    }

    public static void doSomethingFuncional() {
        // Implementación basada en Lambda
        MyFunctionalInterface clippy = (String param) -> {
            return "Hola soy Clippy, y recibí el siguiente parámetro: " + param;
        };

        MyFunctionalInterface wilbert = (p) -> "Hola soy Wilbert, y recibí el siguiente parámetro: " + p;

        doSomethingHighOrder(clippy);
        doSomethingHighOrder(wilbert);
        doSomethingHighOrder(x -> "Hola soy anonymus, y recibí el siguiente parámetro: " + x);

        System.out.println();
        var pickachu = new Pickachu();
        doSomethingHighOrder(pickachu::pika);
        doSomethingHighOrder(pickachu::impactrueno);
        //System.out.println(clippy.doSomeThing("Parámetro Funcional."));
    }

    public static void doSomethingHighOrder(MyFunctionalInterface comportamiento) {
        // Ejecuto el comportamiento que recibí como argumento
        var respuesta = comportamiento.doSomeThing("Java 11 es Genial.");
        System.out.println(respuesta);
    }

    public static void main(String[] args) {

        System.out.println();
        //doSomethingTraditional();
        //doSomethingAnonima();
        doSomethingFuncional();
    }
}
