package com.cga.pro.investigacion.herencia_abstract;

public abstract class Heroe {

    private int ataqueBasico;
    public int vida;
    private Espada espada;

    public Heroe(int vidaInicial, int ataqueBasico, Espada espada) {
        this.vida = vidaInicial;
        this.ataqueBasico = ataqueBasico;
        this.espada = espada;
    }

    public void atacar(Heroe heroe) {
        int danioFinal = this.espada.danioFinal(this.ataqueBasico);
        heroe.recibirDanio(danioFinal);
    }

    public abstract void recibirDanio(int danio);

    public int getVida() {
        return vida;
    }

    public boolean estaMuerto() {
        return (this.vida <= 0);
    }
}
