package com.cga.pro.investigacion.varios;

public class MainCuentas {

    public static void main(String[] args) {

        Cuenta cta = new Cuenta("admin", "root", true);

        System.out.println(cta.identificador());
        System.out.println(cta);

        if (cta.equals(new Cuenta("admin", "root")))
            System.out.println("Iguales");
        else
            System.out.println("Diferentes");

        cta.tienePrivilegios();
    }
}
