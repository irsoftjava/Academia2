package com.cga.hospital;

public class AppHospital {

    public static void main(String[] args) {

        Hospital h = new Hospital("Universitario", new Direccion("Carretera Ofra", 0));


        PersonalSanitario ps = new PersonalSanitario(Especialidad.DERMATOLOGIA, Ambito.INTERNO,
                1, "Juan Delapin Garcia", "36520966F", new Direccion("Calle 7", 10));

        PersonalNoSanitario pns = new PersonalNoSanitario(Oficio.ELECTRICISTA, Ambito.INTERNO,
                123, "Eduardo Perez", "76239877F", new Direccion("Franco de Medina", 41));

        h.add(ps);
        h.add(pns);

        System.out.println(h);
        h.showPersonal();

    }
}
