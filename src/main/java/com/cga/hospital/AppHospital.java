package com.cga.hospital;

public class AppHospital {

    public static void main(String[] args) {

        PersonalSanitario ps = new PersonalSanitario(Especialidad.DERMATOLOGIA, Ambito.INTERNO,
                1, "Juan Delapin Garcia", "36520966F", new Direccion("Calle 7", 10));

        System.out.println(ps);
    }
}
