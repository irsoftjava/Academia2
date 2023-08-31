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

        JOptionPane.showOptionDialog(null, "You are awesome!", "Secret Message", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, null, null, 0);
    }
}
