package com.cga.pro.investigacion.openbookcamp.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static String toMayuscula(String nombre) {
        return nombre.toUpperCase();
    }

    public static String diHola(String nombre) {
        return "Hola " + nombre;
    }

    public static int suma(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

//        int result = suma(1,2);
//        int result2 = suma(2, 1);
//
//        System.out.println(result + " " + result2);
//        System.out.println(diHola("Roger"));

        Funcionales f = new Funcionales();
        f.pruebas();

        ArrayList<String> nombres = new ArrayList<>();
        nombres.add("Paco");
        nombres.add("Pepe");
        nombres.add("Juan");

        Stream<String> valores = nombres.stream()
                .map(x -> x.toUpperCase())
                .filter(x -> x.startsWith("P"));

        valores.forEach(x -> System.out.println(x));

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        var stNumeros = Arrays.stream(numeros);
        var resultado = stNumeros
                .map( x -> x * 2)
                .filter(x -> x % 2 == 0)
                .reduce(0, (x, y) -> {
            System.out.println("X es " + x + " Y es " + y);
            return x + y;
        });
        System.out.println(resultado);
    }
}
