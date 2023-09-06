package com.cga.pro.investigacion.compareTo;

/**
 * @author Ivan Rodriguez Saiz
 */
public class Alumno implements Comparable<Alumno> {

    private String nombre;
    private float calificacion;
    private int edad;

    public Alumno(String nombre, float calificacion, int edad) {
        this.nombre = nombre;
        this.calificacion = calificacion;
        this.edad = edad;
    }

    @Override
    public int compareTo(Alumno o) {
        return this.edad - o.edad;
    }

    @Override
    public String toString() {
        return "" + this.nombre;
    }
}
