package com.cga.pro.investigacion.sealed_class;

public class MainClass {

    public static void main(String[] args) {

        HumanClass men = new Men("Salvador", 38);
        System.out.println(men);

        HumanClass women = new Women("Maria", 25);
        System.out.println(women);
    }
}
