package com.cga.oop8;

public class Elipse extends Figura {

    private double ejeUno;
    private double ejeDos;

    /**
     * Constructor vacío
     */
    public Elipse() {
    }

    /**
     * Constructir Parametrizado
     *
     * @param ejeUno
     * @param ejeDos
     */
    public Elipse(double ejeUno, double ejeDos) {
        this.ejeUno = ejeUno;
        this.ejeDos = ejeDos;
    }

    public double getEjeUno() {
        return ejeUno;
    }

    public void setEjeUno(double ejeUno) {
        this.ejeUno = ejeUno;
    }

    public double getEjeDos() {
        return ejeDos;
    }

    public void setEjeDos(double ejeDos) {
        this.ejeDos = ejeDos;
    }

    @Override
    public double area() {
        return Math.PI * ejeUno * ejeDos;
    }

    @Override
    public double perimetro() {
        //[2×π×Sqrt((r1² + r2²)/2) ]
        return 2 * Math.PI * (Math.sqrt(
                (Math.pow(this.ejeUno, 2) + Math.pow(this.ejeDos, 2)))
                / 2);
        //return (Math.PI * (3 (ejeUno + ejeDos))
        //- (Math.sqrt((3 *))))
    }
}
