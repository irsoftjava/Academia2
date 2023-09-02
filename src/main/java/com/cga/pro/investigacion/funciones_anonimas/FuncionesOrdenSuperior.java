package com.cga.pro.investigacion.funciones_anonimas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class FuncionesOrdenSuperior {

    public static void main(String[] args) {

        // Funciones de Orden Superior: Estas funciones se distinguen por
        // aceptar como parámetros a otras funciones o también puede ser
        // que regresen otras funciones como resultado.

        List<Integer> numeros = Arrays.asList(5, -5, 2, -2, 7, -7, 0, 12, -24, 32, -64, 128);

        BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> filtrar;

        filtrar = (list, predicado) -> {
            List<Integer> result = new ArrayList<>();
            for (Integer i : list) if (predicado.test(i)) result.add(i);
            return result;
        };

        // Números negativos
        System.out.println("Negativos: " + filtrar.apply(numeros,
                (x) -> x < 0));

        // Números positivos
        System.out.println("Positivos: " + filtrar.apply(numeros,
                (x) -> x >= 0));

        // Números pares
        System.out.println("Pares: " + filtrar.apply(numeros,
                (x) -> x % 2 == 0));
    }
}
