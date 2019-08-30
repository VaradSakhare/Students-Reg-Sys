package com.jetbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Add extends JFrame {
    public void caller() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        p1.setLayout(null);
        JTabbedPane tf = new JTabbedPane();

        JLabel l1 = new JLabel("Add STUDENT");
        JLabel l2 = new JLabel("ID");
        JTextField IDt1 = new JTextField();

        JLabel l3 = new JLabel("First Name");
        final JTextField Firstt2 = new JTextField();

        JLabel l4 = new JLabel("Middle Name");
        final JTextField Middlet3 = new JTextField();

        JLabel l5 = new JLabel("Last Name");
        final JTextField Lastt4 = new JTextField();

        JLabel l6 = new JLabel("City");
        String City[] = {"Select City", "Jalgaon", "Nashik", "Nagpure", "Aurangabad", "Pachora", "Pune", "Mumbai", "Chopada"};
        JComboBox cityc1 = new JComboBox(City);

        JLabel l7 = new JLabel("Address");
        final JTextArea Addresst5 = new JTextArea();

        JLabel l8 = new JLabel("Batch");
        String Batch[] = {"Select Branch", "CO", "IT", "MEC", "EE", "EJ"};
        JComboBox Batchc2 = new JComboBox(Batch);

        JLabel l9 = new JLabel("PinCode");
        final JTextField Pint6 = new JTextField();

        JLabel l10 = new JLabel("Phone no");
        final JTextField Phonet7 = new JTextField();

        JLabel l11 = new JLabel("gua.Phone");
        final JTextField guat8 = new JTextField();

        JLabel l12 = new JLabel("Email");
        final JTextField Emailt9 = new JTextField();

        JLabel l13 = new JLabel("Password");
        final JPasswordField passt10 = new JPasswordField();

        JLabel l14 = new JLabel("Re-Paswd");
        final JPasswordField repasst11 = new JPasswordField();

        JButton b1 = new JButton("Submit");

        l1.setBounds(180, 8, 190, 50);
        l1.setFont(new Font("BOLD", Font.ITALIC, 21));
        l2.setBounds(30, 50, 90, 50);
        IDt1.setBounds(100, 65, 110, 20);

        l3.setBounds(30, 100, 90, 50);
        Firstt2.setBounds(100, 115, 110, 20);

        l4.setBounds(28, 160, 90, 30);
        Middlet3.setBounds(100, 165, 110, 20);

        l5.setBounds(30, 215, 90, 20);
        Lastt4.setBounds(100, 215, 110, 20);

        l6.setBounds(30, 255, 90, 50);
        cityc1.setBounds(100, 270, 110, 20);

        l7.setBounds(30, 320, 90, 20);
        Addresst5.setBounds(100, 315, 110, 70);

        l8.setBounds(243, 65, 90, 20);
        Batchc2.setBounds(310, 65, 130, 20);

        l9.setBounds(245, 115, 120, 20);
        Pint6.setBounds(310, 119, 140, 20);

        l10.setBounds(245, 165, 110, 20);
        Phonet7.setBounds(310, 163, 140, 20);

        l11.setBounds(245, 210, 110, 20);
        guat8.setBounds(310, 213, 140, 20);

        l12.setBounds(245, 267, 110, 20);
        Emailt9.setBounds(310, 267, 140, 20);

        l13.setBounds(245,315,110,20);
        passt10.setBounds(310,315,140,20);

        l14.setBounds(247,375,110,20);
        repasst11.setBounds(310,375,140,20);

        b1.setBounds(215, 460, 100, 20);

        p1.add(l1);
        p1.add(l2);
        p1.add(IDt1);
        p1.add(l3);
        p1.add(Firstt2);
        p1.add(l4);
        p1.add(Middlet3);
        p1.add(l5);
        p1.add(Lastt4);
        p1.add(l6);
        p1.add(cityc1);
        p1.add(l7);
        p1.add(Addresst5);
        p1.add(l8);
        p1.add(Batchc2);
        p1.add(l9);
        p1.add(Pint6);
        p1.add(l10);
        p1.add(Phonet7);
        p1.add(l11);
        p1.add(guat8);
        p1.add(l12);
        p1.add(Emailt9);
        p1.add(l13);
        p1.add(passt10);
        p1.add(l14);
        p1.add(repasst11);
        p1.add(b1);

        tf.add("Personal", p1);
        tf.add("Course", p2);
        tf.add("Academic", p3);

        add(tf);
        setVisible(true);
        setSize(700, 600);
        setResizable(false);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s3 = Firstt2.getText();
                String s4 = Middlet3.getText();
                String s5 = Lastt4.getText();
                String s6 = Addresst5.getText();
                String s7 = Pint6.getText();
                String s8 = Phonet7.getText();
                String s9 = guat8.getText();
                String s10= Emailt9.getText();
                  if (s3.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "First name is empty");
                } else if (s4.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Middle name is empty");
                } else if (s5.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Last name is empty");
                } else if (s10.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Email Address is empty");
                }
            }
        });
    }
}