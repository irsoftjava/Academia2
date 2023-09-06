package com.cga.hospital;

import java.util.ArrayList;

/**
 * Clase Hospital
 */
public class Hospital {

    private String nombre;
    private Direccion direccion;
    private ArrayList<Persona> personal;

    /**
     * Constructor clase Hospital
     *
     * <p>La clase Hospital usa una variable privada <i>ArrayList  personal de tipo Persona</i>
     * para almacenar al personal Sanitario y NoSanitario.
     *
     * @param nombre nombre del Hospital, de tipo String
     * @param direccion direccion del Hospital, de tipo Direccion
     * @see Direccion
     * @see Persona
     * @author Ivan Rodriguez Saiz
     */
    public Hospital(String nombre, Direccion direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        personal = new ArrayList<>();
    }

    /**
     * add - Agrega a la colleccion <i>ArrayList de tipo Persona la variable p de tipo Persona</i>
     * @param p de tipo Persona
     * @see Persona
     */
    public void add(Persona p) {
        personal.add(p);
    }

    /**
     * showPersonal - Muestra por consola todo el personal del Hospital
     * tanto Sanitarios como NoSanitarios
     */
    public void showPersonal() {
        System.out.println();
        if (!personal.isEmpty()) {
            for (Persona p : personal) {
                System.out.println(p);
            }
        }
    }

    @Override
    public String toString() {
        System.out.println();
        return "Hospital: " + this.nombre + " Dirección: " + this.direccion;
    }
}
