package com.cga.hospital;

public class PersonalNoSanitario extends Persona {

    private Oficio oficio;
    private Ambito ambito;

    /**
     * Constructor para PersonalNoSanitario:
     * Es todo aquel personal que trabaja en un ambito distinto al sanitario.
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
