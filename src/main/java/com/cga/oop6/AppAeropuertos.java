package com.cga.oop6;

public class AppAeropuertos {

    public static void main(String[] args) {

        // Creamos el objeto dir de tipo Direccion
        Direccion dir1 = new Direccion("España", "Carretera Norte", 41, "La Laguna");
        Direccion dir2 = new Direccion("España", "Carretera Sur", 33, "Granadilla");


        // Creamos un Aeropuerto Público ap1 y un Aeropuerto Privado ap2
        AeropuertoPublico ap1 = new AeropuertoPublico(105000.25, 10,
                "Tenerife Norte Ciudad de la Laguna", dir1, 1965, 890);

        AeropuertoPrivado ap2 = new AeropuertoPrivado(85, "Reina Sofía",
                dir2, 1970, 900);

        System.out.println();
        System.out.println(ap1);
        System.out.println();
        System.out.println(ap2);
    }
}
