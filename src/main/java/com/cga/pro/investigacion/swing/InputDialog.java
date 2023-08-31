package com.cga.pro.investigacion.swing;

import javax.swing.*;

public class InputDialog {

    public static void main(String[] args) {

        String animal = (JOptionPane.showInputDialog(null, "Selecciona el animal que te gusta mas", "Animales",
                JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Selecciona", "Perro", "Gato", "Mono", "Caballo"},
                "Selecciona")).toString();
        JOptionPane.showMessageDialog(null, "Tu animal favorito es: " + animal, "Animales", JOptionPane.PLAIN_MESSAGE);

        int numAleatorio = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número cualquiera: ", "Números Aleatorios",
                JOptionPane.PLAIN_MESSAGE));
        JOptionPane.showMessageDialog(null, "Tu número aleatorio es: " + numAleatorio, "Números Aleatorios", JOptionPane.PLAIN_MESSAGE);
    }
}
