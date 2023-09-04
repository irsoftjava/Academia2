package com.cga.pro.investigacion.loteria;

import java.util.List;

public class AppLoteria {

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
