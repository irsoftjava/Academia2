package com.cga.oop1;

import javax.swing.*;

public class OptionAvion {

    public static void main(String[] args) {

        ImageIcon avion = new ImageIcon("./src/main/java/com/cga/oop1/avion.png");
        ImageIcon error = new ImageIcon("./src/main/java/com/cga/oop1/error.png");
        String modeloAvion;
        int numeroDeAsientos = 0;
        double velocidadMaxima = 0.0;
        int preg = 0;
        boolean isOK = false;

        do {
            do {
                modeloAvion = (String) JOptionPane.showInputDialog(null, "Selecciona el Avion: ", "Aviones",
                        JOptionPane.PLAIN_MESSAGE, avion,
                        new Object[]{"AirBus A320", "AirBus A380-800", "Boeing 737", "Boeing 777", "Boeing 747"},
                        "Selecciona");
                if (modeloAvion != null && !modeloAvion.isEmpty()) preg++; else { isOK = true; break; }
            } while (!(1 == preg));

            if (!isOK) {
                do {
                    try {
                        numeroDeAsientos = Integer.parseInt(JOptionPane.showInputDialog(null, "Números de asientos del " + modeloAvion,
                                "Aviones", JOptionPane.PLAIN_MESSAGE));
                        preg++;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "ERROR: Debe introducir una cantidad", "ERROR",
                                JOptionPane.ERROR_MESSAGE, error);
                    }
                } while (preg != 2);

                do {
                    try {
                        velocidadMaxima = Double.parseDouble(JOptionPane.showInputDialog(null, "Velovidad Máxima del  " + modeloAvion,
                                "Aviones", JOptionPane.PLAIN_MESSAGE));
                        preg++;
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "ERROR: Debe introducir la velocidad del avión", "ERROR",
                                JOptionPane.ERROR_MESSAGE, error);
                    }
                } while (preg != 3);
                isOK = true;
            }

        } while (!isOK);

        if (preg == 3) {
            Avion miAvion = new Avion(modeloAvion, numeroDeAsientos, velocidadMaxima);

            JOptionPane.showMessageDialog(null, miAvion.toString(),
                    modeloAvion, JOptionPane.INFORMATION_MESSAGE, avion);

            System.out.println(miAvion);
        }
    }
}
