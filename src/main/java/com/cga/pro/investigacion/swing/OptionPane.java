package com.cga.pro.investigacion.swing;

import javax.swing.*;

public class OptionPane {

    public static void main(String[] args) {

        //JOptionPane.showMessageDialog(null, "This is some useless info","Title", JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Here is more useless info","Title", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Really?","Title", JOptionPane.QUESTION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "You're computer has a VIRUS!!!","Title", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!!","Title", JOptionPane.ERROR_MESSAGE);

        //System.out.println(JOptionPane.showConfirmDialog(null, "Bro, do you even code?", "This is my Title", JOptionPane.YES_NO_CANCEL_OPTION));
        //String name = JOptionPane.showInputDialog("What is your name?");
        // System.out.println(name);

        /*
        String[] responses = {"No, you're awesome!", "Thank you", "*Blush*"};
        ImageIcon icon = new ImageIcon("./src/main/java/com/cga/pro/investigacion/swing/carita.png");
        JOptionPane.showOptionDialog(null, "You are awesome!", "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, icon, responses, 0);

        ImageIcon icon2 = new ImageIcon("./src/main/java/com/cga/pro/investigacion/swing/carita2.png");
        String[] arreglo = {"Monitor", "Teclado", "Mouse"};
        int opcion = JOptionPane.showOptionDialog(null, "Elije una palabra", "Elije...", 0, JOptionPane.QUESTION_MESSAGE,
                icon2, arreglo, "Monitor" );
        System.out.println("La opción seleccionada fue la " + opcion);
        */

        String[] opciones = {"Si", "No", "Cancelar"};
        ImageIcon icon3 = new ImageIcon("./src/main/java/com/cga/pro/investigacion/swing/cafe.png");
        int salida = JOptionPane.showConfirmDialog(null, "Te gustan los tacos?", "Elige...", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.WARNING_MESSAGE, icon3);
        System.out.println(salida);

    }
}
