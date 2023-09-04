package com.cga.pro.investigacion.varios;

public class SqrtIter {

    public static Double sqrtIter(Double guess, Double x) {
        return (isGoodEnough(guess, x)) ? guess : sqrtIter(inprove(guess, x), x);
    }

    public static Boolean isGoodEnough(Double guess, Double x) {
        return Math.abs(guess * guess - x ) < 0.001;
    }

    public static Double inprove(Double guess, Double x) {
        return (guess + x / guess) / 2;
    }

    public static void main(String[] args) {
        Double a = sqrtIter(1.0, 54.0);
        System.out.println(a);
    }
}
