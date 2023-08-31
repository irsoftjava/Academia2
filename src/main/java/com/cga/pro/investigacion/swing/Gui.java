package com.cga.pro.investigacion.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui implements ActionListener {

    // https://beginnersbook.com/2015/07/java-swing-tutorial

    private static JTextField userText;
    private static JPasswordField passwordText;
    private static JLabel success;
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(350, 180);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField(80);
        userText.setBounds(80, 20, 200, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(80);
        passwordText.setBounds(80, 50, 200, 25);
        panel.add(passwordText);

        JButton button = new JButton("Login");
        button.setBounds(130,105,80,25);
        button.addActionListener(new Gui());
        panel.add(button);

        success = new JLabel("");
        success.setBounds(10,80, 120,25);
        panel.add(success);

        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + password);

        if (user.equals("irsoft") && password.equals("cachoarae")) {
            success.setText("Login successful!");
        }
    }
}
