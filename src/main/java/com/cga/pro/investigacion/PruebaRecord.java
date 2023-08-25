package com.cga.pro.investigacion;

public class PruebaRecord {

    public static void main(String[] args) {

        Registro reg = new Registro("Ivan Rodriguez Saiz", 54);

        System.out.println(reg);
        System.out.println(reg.hashCode());
        System.out.println("El usuario: " + reg.name() + ", es mayor de edad? " + reg.mayorDeEdad());
    }
}
