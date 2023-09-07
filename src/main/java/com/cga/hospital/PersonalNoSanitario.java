package com.cga.hospital;

public class PersonalNoSanitario extends Persona {

    private Oficio oficio;
    private Ambito ambito;

    /**
     * Constructor para PersonalNoSanitario:
     * Es toda aquella persona que trabaja en un ambito distinto al sanitario.
     *
     * @param oficio oficio de la Persona, de tipo enum Oficio
     * @param ambito ambito en el que trabaja, de tipo enum Ambito
     * @param id id de la Persona, de tipo int
     * @param nombre nombre de la Persona, de tipo String
     * @param dni dni de la Persona, de tipo String
     * @param direccion direccion de la Persona de tipo Direccion
     * @see Persona
     * @see Direccion
     * @see Oficio
     * @see Ambito
     *
     * @author Ivan Rodriguez Saiz
     */

    public PersonalNoSanitario(Oficio oficio, Ambito ambito,
                               int id, String nombre, String dni, Direccion direccion) {
        super(id, nombre, dni, direccion);
        this.oficio = oficio;
        this.ambito = ambito;
    }

    @Override
    public String toString() {
        return "ID: " + super.getId() + " -> Nombre: " + super.getNombre() + " con DNI: " +
                super.getDni() + " Domicilio: " + super.getDireccion() +
                "\nOficio: " + this.oficio + " y es trabajador " + this.ambito;
    }
}
