package com.cga.hospital;

/**
 * Clase Person
 *
 */
public class Persona {
    private int id;
    private String nombre;
    private String dni;
    private Direccion direccion;

    /**
     * Constructor Clase Person
     *
     * @param id        id de la Persona
     * @param nombre    nombre de la Persona
     * @param dni       dni de la Persona
     * @param direccion dirección de la Persona
     *
     * @author Ivan Rodriguez Saiz
     */
    public Persona(int id, String nombre, String dni, Direccion direccion) {
        this.id = id;
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
    }

    /**
     * Obtiene el id de la Persona
     * @return int
     */
    public int getId() {
        return id;
    }

    /**
     * Modifica el id de la Persona
     * @param id de tipo int
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtiene el nombre de la Persona
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la Persona
     * @param nombre de tipo String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el dni de la Persona
     * @return String
     */
    public String getDni() {
        return dni;
    }

    /**
     * Modifica el dni de la Persona
     * @param dni de tipo String
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

    /**
     * Obtiene la dirección de la Persona
     * @return Direccion
     * @see Direccion
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Modifica la dirección de la Persona
     * @param direccion tipo Direccion
     * @see Direccion
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
