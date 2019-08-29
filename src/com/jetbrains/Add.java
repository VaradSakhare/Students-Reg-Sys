package com.jetbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Add extends JFrame
{
    public void caller() {
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        p1.setLayout(null);
        JTabbedPane tf = new JTabbedPane();
        //JScrollBar sc = new JScrollBar();

        JLabel l1 = new JLabel("Add STUDENT");
        JLabel l2 = new JLabel("ID");
        JLabel l3 = new JLabel("First Name");
        JLabel l4 = new JLabel("Middle Name");
        JLabel l5 = new JLabel("Last Name");
        JLabel l6 = new JLabel("City");
        JLabel l7 = new JLabel("Address");
        JLabel l8 = new JLabel("Batch");
        JLabel l9 = new JLabel("PinCode");
        JLabel l10 = new JLabel("Email");
        JLabel l11 = new JLabel("password");
        JLabel l12 = new JLabel("Re-pass");

        String City[] = {"Select City", "Jalgaon", "Nashik", "Nagpure", "Aurangabad", "Pachora", "Pune", "Mumbai", "Chopada"};
        JComboBox c1 = new JComboBox(City);
        String Batch[] = {"Select Branch", "CO", "IT", "MEC", "EE", "EJ"};
        JComboBox c2 = new JComboBox(Batch);

        JButton b1 = new JButton("Submit");


        JTextField t1 = new JTextField();
        final JTextField t2 = new JTextField();
        final JTextField t3 = new JTextField();
        final JTextField t4 = new JTextField();
        final JTextArea t5 = new JTextArea();
        final JTextField t6 = new JTextField();
        final JTextField t7 = new JTextField();
        final JPasswordField t8 = new JPasswordField();
        final JPasswordField t9 = new JPasswordField();

        l1.setBounds(180, 8, 190, 50);
        l1.setFont(new Font("BOLD", Font.ITALIC, 21));
        l2.setBounds(30, 50, 90, 50);
        t1.setBounds(100, 65, 110, 20);
        l3.setBounds(30, 100, 90, 50);
        t2.setBounds(100, 115, 110, 20);
        l4.setBounds(28, 160, 90, 30);
        t3.setBounds(100, 165, 110, 20);
        l5.setBounds(30, 215, 90, 20);
        t4.setBounds(100, 215, 110, 20);
        l6.setBounds(30, 255, 90, 50);
        c1.setBounds(100, 270, 110, 20);
        l7.setBounds(30, 320, 90, 20);
        t5.setBounds(100, 315, 110, 70);
        l8.setBounds(243, 65, 90, 20);
        c2.setBounds(300, 65, 130, 20);
        l9.setBounds(245, 115, 120, 20);
        t6.setBounds(300, 119, 140, 20);
        l10.setBounds(245, 165, 110, 20);
        t7.setBounds(300, 163, 140, 20);
        l11.setBounds(245, 210, 110, 20);
        t8.setBounds(300, 213, 140, 20);
        l12.setBounds(245, 267, 110, 20);
        t9.setBounds(300, 267, 140, 20);

        b1.setBounds(215, 430, 100, 20);
        //sc.setBounds(100,100,50,100);

        p1.add(l1);
        p1.add(l2);
        p1.add(t1);
        p1.add(l3);
        p1.add(t2);
        p1.add(l4);
        p1.add(t3);
        p1.add(l5);
        p1.add(t4);
        p1.add(l6);
        p1.add(c1);
        p1.add(l7);
        p1.add(t5);
        p1.add(l8);
        p1.add(c2);
        p1.add(l9);
        p1.add(t6);
        p1.add(l10);
        p1.add(t7);
        p1.add(l11);
        p1.add(t8);
        p1.add(l12);
        p1.add(t9);
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
                String s3 = t2.getText();
                String s4 = t3.getText();
                String s5 = t4.getText();
                String s6 = t5.getText();
                String s7 = t6.getText();
                String s8 = t7.getText();
                String s9 = t8.getText();
                String s10 = t9.getText();
                if (s3.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "First name is empty");
                } else if (s4.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Middle name is empty");
                } else if (s5.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Last name is empty");
                } else if (s6.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Email Address is empty");
                } else if (s7.length() > 11) {
                    JOptionPane.showMessageDialog(null, "Phone number is Digit above 10 ");
                }
            }
        });
    }