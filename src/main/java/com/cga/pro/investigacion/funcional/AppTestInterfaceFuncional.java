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
        // Clase anónima
        MyFunctionalInterface duke = new MyFunctionalInterface() {
            @Override
            public String doSomeThing(String param) {
                return "Hola soy Duke, y recibí el siguiente parámetro: " + param;
            }
        };

        System.out.println(duke.doSomeThing("Clase anónima."));
    }

    public static void doSomethingFuncional() {

        MyFunctionalInterface clippy = (String param) -> {
            return "Hola soy Clippy, y recibí el siguiente parámetro: " + param;
        };

        System.out.println(clippy.doSomeThing("Parámetro Funcional."));
    }

    public static void main(String[] args) {

        System.out.println();
        doSomethingTraditional();
        doSomethingAnonima();
        doSomethingFuncional();
    }
}
