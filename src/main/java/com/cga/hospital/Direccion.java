package com.cga.hospital;

/**
 * Clase Direccion
 *
 * @author Ivan Rodriguez Saiz
 */
public class Direccion {

    private String calle;
    private int numero;

    /**
     * Constructor clase Direccion
     *
     * @param calle de tipo String
     * @param numero de tipo int
     */
    public Direccion(String calle, int numero) {
        this.calle = calle;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return this.calle + " #" + this.numero;
    }
}
