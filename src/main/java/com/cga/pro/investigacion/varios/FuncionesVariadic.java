package com.cga.pro.investigacion.varios;

public class FuncionesVariadic {

    public static double sumar(Number... valores) {
        Integer ti = 0;
        Double td = 0.0;
        int hasta = valores.length;
        String str = "[";


        for (int i = 0; i < hasta; i++) {

            if (valores[i] instanceof Integer) {
                //str += (int)valores[i];
                str += Integer.toString((int) valores[i]);
                ti = ti + valores[i].intValue();
            }

            if (valores[i] instanceof Double) {
                //str += (double)valores[i];
                str += Double.toString((double) valores[i]);
                td = td + valores[i].doubleValue();
            }

            if (hasta - i == 1) {
                str += "]";
            } else {
                str += ", ";
            }
        }

        System.out.println(str);
        return ti.doubleValue() + td;
    }

    public static void main(String[] args) {

        double a = sumar(3.141596, 6.28, 1, 2, 3, 4, 5);
        System.out.println("Suma: " + a);

        System.out.println();

        double b = sumar(1, 2, 3, 4.0, 5.5, 6.0, 7.0, 8.0);
        System.out.println("Suma: " + b);

    }
}
