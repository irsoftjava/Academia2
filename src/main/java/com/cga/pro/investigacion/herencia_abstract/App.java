package com.cga.pro.investigacion.herencia_abstract;

/**
 * Modelar un Juego en donde Heroes pelean entre sí.
 * Los Heroes tienen vida y una Espada.
 * Cada Héroe empieza con la misma cantidad de vida, pero
 * su ataque básico puede variar.
 * Cada Espada puede multiplicar el daño dependiendo del filo.
 * Un Héroe se considera muerto cuando su vida llega a cero.
 */

public class App {

    public static void main(String[] args) {

        Gladiador g = new Gladiador(new Espada(2));
        Gladiador g2 = new Gladiador(new Espada(2));
        Mounstruo m = new Mounstruo(new Espada(1));

        g.atacar(m);
        g.atacar(g2);


        System.out.println(m.getVida());
        System.out.println(g2.getVida());

    }
}
