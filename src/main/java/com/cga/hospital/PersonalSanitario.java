package com.cga.hospital;

public class PersonalSanitario extends Persona {

    private Especialidad especialidad;
    private Ambito ambito;

    /**
     * Constructor para PersonalSanitario:
     *
     * <p>Es todo aquel personal que trabaja directamente en el ambito sanitario.
     *
     * @param especialidad  - Esecialidad de la Persona
     * @param ambito        - Ambito al que pertenece (INTERNO, EXTERNO)
     *
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
