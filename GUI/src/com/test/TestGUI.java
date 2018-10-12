package com.test;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestGUI {
    private JPanel panel1;
    private JButton button1;

    private TestGUI() {
        button1.addActionListener(e -> {
            JOptionPane.showMessageDialog(null, "Hello");
            System.exit(3);
        });

        //button1.addActionListener(new ActionListener() {
        //@Override
        //public void actionPerformed(ActionEvent e) {
        //JOptionPane.showMessageDialog(null, "Hello");
        //System.exit(3);
        //}
        //});
        //
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("App");
        frame.setContentPane(new TestGUI().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
