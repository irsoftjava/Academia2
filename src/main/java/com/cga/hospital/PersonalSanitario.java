package com.cga.hospital;

public class PersonalSanitario extends Persona {

    private Especialidad especialidad;
    private Ambito ambito;

    /**
     * Constructor para PersonalSanitario: Es toda aquella persona que trabaja directamente en el ambito sanitario.
     *
     * @param especialidad  esecialidad de la Persona, de tipo enum Especialidad
     * @param ambito        ambito al que pertenece la Persona, de tipo enum Ambito
     * @param id id de la Persona, de tipo int
     * @param nombre nombre de la Persona, de tipo String
     * @param dni dni de la Persona, de tipo String
     * @param direccion direccion de la Persona de tipo Direccion
     * @see Persona
     * @see Direccion
     * @see Especialidad
     * @see Ambito
     *
     * @author Iván Rodriguez Saiz.
     */
    public PersonalSanitario(Especialidad especialidad, Ambito ambito,
                             int id, String nombre, String dni, Direccion direccion) {
        //super.setId(id);
        //super.setNombre(nombre);
        //super.setDni(dni);
        //super.setDireccion(direccion);
        super(id, nombre, dni, direccion);
        this.especialidad = especialidad;
        this.ambito = ambito;
    }

    @Override
    public String toString() {
        return "ID: " + super.getId() + " -> Nombre: " + super.getNombre() + " con DNI: " +
                super.getDni() + " Domicilio: " + super.getDireccion() +
                "\nEspecialidad: " + this.especialidad + " y es trabajador " + this.ambito;
    }
}
