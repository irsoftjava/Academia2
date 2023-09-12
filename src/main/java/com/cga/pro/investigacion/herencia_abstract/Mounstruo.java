package com.cga.pro.investigacion.herencia_abstract;

public class Mounstruo extends Heroe {

    static int VIDA_INICIAL = 150;

    static int ATAQUE_BASICO = 5;
    public Mounstruo(Espada espada) {
        super(VIDA_INICIAL, ATAQUE_BASICO, espada);
    }

    @Override
    public void recibirDanio(int danio) {
        this.vida -= danio;
    }
}
