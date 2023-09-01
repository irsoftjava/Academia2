package com.cga.oop2;

import javax.swing.*;

public class OptionAeropuerto {

    public static void main(String[] args) {

        ImageIcon aeropuerto = new ImageIcon("./src/main/java/com/cga/oop2/AirPort.png");
        ImageIcon error = new ImageIcon("./src/main/java/com/cga/oop2/error.png");
        String nombreAeropuerto = "";
        String pais = "";
        String calle = "";
        int numero = 0;
        String ciudad = "";
        int anioInaug = 0;
        int capacidad = 0;
        int preg = 0;
        boolean isOK = false;

        do {
            nombreAeropuerto = (String) JOptionPane.showInputDialog(null, "Selecciona el Aeropuerto", "Aeropuertos",
                    JOptionPane.PLAIN_MESSAGE, aeropuerto,
                    new Object[]{"Tenerife Norte - Ciudad de la Laguna", "Tenerife Sur - Reina Sofia",
                            "Aeropuerto Internacional de La Palma", "Aeropuerto de Gran Canaria", "Aeropuerto La Gomera"}, "Selecciona");
            if (nombreAeropuerto != null && !nombreAeropuerto.isEmpty()) preg++;
            else {
                preg = 5;
                break;
            }

            pais = JOptionPane.showInputDialog(null, "Introduzca el Pais del Aeropuerto ", nombreAeropuerto,
                    JOptionPane.PLAIN_MESSAGE);
            if (pais != null) preg++;
            else {
                preg = 5;
                break;
            }

            calle = JOptionPane.showInputDialog(null, "Introduzca la calle del Aeropuerto ", nombreAeropuerto,
                    JOptionPane.PLAIN_MESSAGE);
            if (calle != null) preg++;
            else {
                preg = 5;
                break;
            }

            do {
                try {
                    numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca número de la calle del Aeropuerto ", nombreAeropuerto,
                            JOptionPane.PLAIN_MESSAGE));
                    isOK = true;
                    preg++;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "ERROR: Debe introducir un valor numérico",
                            "ERROR", JOptionPane.ERROR_MESSAGE, error);
                }
            } while (!isOK);

            ciudad = JOptionPane.showInputDialog(null, "Introduzca la Ciudad del Aeropuerto ", nombreAeropuerto,
                    JOptionPane.PLAIN_MESSAGE);
            if (ciudad != null) preg++;
            else {
                preg = 5;
                break;
            }

            do {
                isOK = false;
                try {
                    anioInaug = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca el Año de Inauguración del Aeropuerto ", nombreAeropuerto,
                            JOptionPane.PLAIN_MESSAGE));
                    isOK = true;
                    preg++;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "ERROR: Debe introducir un valor numérico",
                            "ERROR", JOptionPane.ERROR_MESSAGE, error);
                }
            } while (!isOK);

            do {
                isOK = false;
                try {
                    capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca la Capacidad del Aeropuerto ", nombreAeropuerto,
                            JOptionPane.PLAIN_MESSAGE));
                    isOK = true;
                    preg++;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "ERROR: Debe introducir un valor numérico",
                            "ERROR", JOptionPane.ERROR_MESSAGE, error);
                }
            } while (!isOK);

        } while (preg != 7);

        if (isOK) {
            Aeropuerto aeropuerto1 = new Aeropuerto(nombreAeropuerto, pais, calle, numero, ciudad, anioInaug, capacidad);

            JOptionPane.showMessageDialog(null, aeropuerto1.toString(),
                    nombreAeropuerto, JOptionPane.INFORMATION_MESSAGE, aeropuerto);

            System.out.println(aeropuerto1);
        }
    }
}
