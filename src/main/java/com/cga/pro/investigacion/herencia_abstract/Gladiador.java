package com.cga.pro.investigacion.herencia_abstract;

public class Gladiador extends Heroe {

    static int VIDA_INICIAL = 100;

    static int ATAQUE_BASICO = 30;
    public Gladiador(Espada espada) {
        super(VIDA_INICIAL, ATAQUE_BASICO, espada);
    }

    @Override
    public void recibirDanio(int danio) {
        int danioFinal = danio / 2;
        this.vida -= danioFinal;
    }
}
