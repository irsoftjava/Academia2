package com.cga.pro.investigacion.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OurFirstGUI implements ActionListener {

    // https://introcs.cs.princeton.edu/java/15inout/GUI.java.html

    private int count = 0;
    private JLabel label;

    public void GUI() {

        JFrame frame = new JFrame();

        JButton button = new JButton("Click Me");
        button.addActionListener(this);
        label = new JLabel("Number of clicks:  0      ");

        JPanel panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Our GUI");
        frame.pack();

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        new OurFirstGUI().GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " + count);
    }
}
