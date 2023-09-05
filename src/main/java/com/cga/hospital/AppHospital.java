package com.cga.hospital;

public class AppHospital {

    public static void main(String[] args) {

        Hospital hospital = new Hospital("Universitario", new Direccion("Carretera Ofra", 0));


        PersonalSanitario ps = new PersonalSanitario(Especialidad.DERMATOLOGIA, Ambito.INTERNO,
                1, "Juan Delapin Garcia", "36520966F", new Direccion("Calle 7", 10));
        PersonalSanitario ps1 = new PersonalSanitario(Especialidad.PSICOLOGIA, Ambito.EXTERNO,
                2, "Roberto Antonio Rodriguez", "28539744G", new Direccion("Junquillo", 23));
        PersonalSanitario ps2 = new PersonalSanitario(Especialidad.DERMATOLOGIA, Ambito.INTERNO,
                3, "Maria Elena Perez", "66121863K", new Direccion("Venezuela", 88));

        PersonalNoSanitario pns = new PersonalNoSanitario(Oficio.ELECTRICISTA, Ambito.EXTERNO,
                326, "Eduardo Perez", "76239877F", new Direccion("Franco de Medina", 41));
        PersonalNoSanitario pns1 = new PersonalNoSanitario(Oficio.AUX_LIMPIEZA, Ambito.INTERNO,
                133, "Angustia González Mesa", "42358713L", new Direccion("El Rocío", 92));
        PersonalNoSanitario pns2 = new PersonalNoSanitario(Oficio.FONTANERO, Ambito.EXTERNO,
                87, "Armando Diaz Ortega", "55239010M", new Direccion("Pico Viejo", 1));

        hospital.add(ps);
        hospital.add(ps1);
        hospital.add(ps2);

        hospital.add(pns);
        hospital.add(pns1);
        hospital.add(pns2);

        System.out.println(hospital);
        hospital.showPersonal();

    }
}
