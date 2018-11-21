package com.appcl.gui;

import javax.swing.*;
import java.awt.*;

public class HomePage {

    public static void main(String args []) {

        JFrame jFrame = new JFrame("Scarlett Overkill");

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Open Customer Centre!");

        JButton button = new JButton();
        button.setText("Customer Centre");

        //panel.add(label);
        //panel.add(button);
        panel.setBackground(Color.CYAN);
        jFrame.setContentPane(new JLabel(new ImageIcon("C://Users//l0011//OneDrive//devops18//appcl//ScarletOverkill//src//com//appcl//helpers//ScarletOverkill.png")));
        jFrame.add(label);
        jFrame.add(button);

        jFrame.add(panel);
        jFrame.setSize(500, 600);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
