package com.cga.pro.arraylist;

import java.util.ArrayList;

// Crear una aplicación que sea capaz de insertar los siguientes datos en un ArrayList.
// Nombre, Apellido, DNI, Edad, Calle, Número, CP, Provincia
public class Ejercicio3 {

    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente("Juan Ernesto", "Navarro", "11111111A", 40, "Calle 7", 125, 70200, "La Gomera"));
        clientes.add(new Cliente("Maria Elena", "Suarez", "22222222B", 25, "Avellaneda", 14, 70201, "Lanzarote"));
        clientes.add(new Cliente("Elvira", "Rodriguez", "33333333C", 3, "Mas Palomas", 56, 70318, "Las Palmas"));
        clientes.add(new Cliente("Antonio", "Lopez", "44444444D", 57, "José Marti", 88, 70300, "Las Palmas"));
        clientes.add(new Cliente("Jose Juan", "Maldonado", "55555555E", 18, "Eduardo de Roo", 32, 70310, "Tenerife"));

        for (Cliente cliente : clientes)
            System.out.println(cliente);
    }
}
