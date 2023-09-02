package com.cga.pro.investigacion.funciones_anonimas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FuncAnonimas {

    //static boolean esPar(Integer n) {
    //    return n % 2 == 0;
    //}

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18);
        List<Integer> resultados = new ArrayList<>();

        // De forma Imperativa
        /*
        for (int i = 0; i < numeros.size(); i++)
            if (numeros.get(i) % 2 == 0)
                resultados.add(numeros.get(i));
        */

        // De forma Funcional
        resultados = numeros.stream()
                //.filter(FuncAnonimas::esPar)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(resultados);
    }
}
