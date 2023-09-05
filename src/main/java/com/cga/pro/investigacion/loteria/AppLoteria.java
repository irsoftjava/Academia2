package com.cga.pro.investigacion.loteria;

import java.util.List;

/*
1, 2, 3, 4, 5 y 6
1, 2, 3, 4, 7 y 8
1, 2, 5, 6, 7 y 8
9, 10, 11, 12, 13 y 14
9, 10, 11, 15, 16 y 17
12, 13, 14, 15, 16 y 17
18, 19, 20, 21, 26 y 27
18, 19, 22, 23, 30 y 31
18, 19, 24, 25, 28 y 29
20, 21, 22, 23, 28 y 29
20, 21, 24, 25, 30 y 31
22, 23, 24, 25, 26 y 27
26, 27, 28, 29, 30 y 31
32, 33, 34, 35, 40 y 41
32, 33, 36, 37, 44 y 45
32, 33, 38, 39, 42 y 43
34, 35, 36, 37, 42 y 43
34, 35, 38, 39, 44 y 45
36, 37, 38, 39, 40 y 41
40, 41, 42, 43, 44 y 45
46, 47, 48, 49, 54 y 55
*
* */

public class AppLoteria {

    //List<Integer, List<Integer>> apuestas = new ArrayList<ArrayList<>>();
    public static void main(String[] args) {

        Loteria loteria = new Loteria();

        //List<Integer> apuesta = loteria.generaBonoloto();
        List<Integer> apuesta = List.of(1, 23, 27, 31, 39, 44);
        System.out.println(apuesta);
        int c = 0;
        for (int i = 0; i < 720; i++) {
            List<Integer> tiradas = loteria.generaBonoloto();
            Integer aciertos = loteria.compareTo(tiradas, apuesta);

            if (aciertos >= 3) {
                c++;
                System.out.println("    " + c + " ->" + tiradas + " -> " + aciertos);
            }
        }
    }
}
