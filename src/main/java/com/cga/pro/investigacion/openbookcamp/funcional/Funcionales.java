package com.cga.pro.investigacion.openbookcamp.funcional;

import java.util.function.Function;

public class Funcionales {

    private Function<String, String> toMayus = x -> x.toUpperCase();
    private Function<Integer, Integer> sumador = x -> x.sum(x, x);
    public void pruebas() {
        System.out.println(toMayus.apply("Yamil"));
        System.out.println(sumador.apply(5));
    }

    public void Saluda(Function<String, String> miFuncion, String nombre) {
        miFuncion.apply(nombre);
    }
}
