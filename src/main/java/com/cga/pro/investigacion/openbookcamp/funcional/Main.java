package com.cga.pro.investigacion.openbookcamp.funcional;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Main {

    public static String toMayuscula (String nombre){
        return nombre.toUpperCase();
    }

    public static String diHola (String nombre){
        return "Hola " + nombre;
    }
    public static int suma ( int a, int b){
        return a + b;
    }

    public static void main(String[] args) {

        int result = suma(1,2);
        int result2 = suma(2, 1);

        System.out.println(result + " " + result2);
        System.out.println(diHola("Roger"));

        Funcionales f = new Funcionales();
        f.pruebas();

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Paco");
        nombres.add("Pepe");
        nombres.add("Juan");

        Stream<String> valores = nombres.stream().map(x -> "Hola: " + x.toUpperCase());
        valores.forEach(x -> System.out.println(x));
    }
}
