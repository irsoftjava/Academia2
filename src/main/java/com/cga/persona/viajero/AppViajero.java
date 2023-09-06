package com.cga.persona.viajero;

public class AppViajero {

    public static void main(String[] args) {

        Viajero v1 = new Viajero("Eduardo", "Hernandez", "54391190H",
                "Venezolano", new Direccion("Eduardo de Roo", 34));

        Viajero v2 = new Viajero("Jose", "Benitez", "65423401G",
                "Español", "Altamira", 103);

        Viajero v3 = new Viajero("Fito", "Paez", "78923897D",
                "Argentino", new Direccion("Machado Ventura", 14));

        Viajero v4 = new Viajero("Eduardo", "Hernandez", "54391190H",
                "Frances", "Ave. de los Martires", 88);

        Viajero v5 = new Viajero("Osmani", "Lagos", "54391190H",
                "Italiano", new Direccion("Fernando de Zayas", 44));

        System.out.println();
        System.out.printf("Se ha creado %d Viajeros.", Viajero.cantViajeros);

        System.out.println();
        v3.getInfo(false);
    }
}
