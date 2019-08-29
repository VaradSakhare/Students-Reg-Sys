package com.jetbrains;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame f1=new JFrame("My Frame");
        JLabel l1=new JLabel("Students Login");
        JLabel l2=new JLabel("Name");
        JLabel l3=new JLabel("Password");
        final JTextField t1=new JTextField();
        final JPasswordField p1=new JPasswordField();
        JButton b1=new JButton("Login");
        JButton b2=new JButton("Cancel");
        l1.setFont(new Font("Cambria",Font.BOLD,21));
        l2.setFont(new Font("Cambria",Font.BOLD,20));
        l3.setFont(new Font("Cambria",Font.BOLD,20));
        l1.setBounds(170,130,150,20);
        l2.setBounds(100,180,70,20);
        l3.setBounds(100, 230,100,20);
        t1.setBounds(200,180,90,25);
        p1.setBounds(200,230,90,25);
        b1.setBounds(95,300,80,25);
        b2.setBounds(210,300,90,25);
        f1.add(l1);
        f1.add(l2);
        f1.add(t1);
        f1.add(l3);
        f1.add(p1);
        f1.add(b1);
        f1.add(b2);
        f1.setLayout(null);
        f1.setSize(500,500);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String s1=t1.getText();
                String s2=p1.getText();
                if(s1.isEmpty()){
                    JOptionPane.showMessageDialog(null,"username is Empty");
                }
                else if(s2.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"password is empty");
                }
                else if(s1.isEmpty() && s2.isEmpty()) {
                    JOptionPane.showMessageDialog(null,"username and password is empty");
                }
                else if(s1.equals("Admin") && s2.equals("1234")){
                    JOptionPane.showMessageDialog(null,"Login Successfully");
                    Second se1 = new Second();
                    se1.callf2();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Wrong ");
                }
            }
        });

        f1.setVisible(true);
        f1.setSize(500,500);
        f1.setResizable(false);
    }
}