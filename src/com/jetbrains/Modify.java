package com.jetbrains;

import javax.swing.*;
import java.awt.*;

public class Modify {
    public void calls(){
        JFrame f5=new JFrame("Update frame");

        JLabel l1=new JLabel("Update STUDENT");

        JLabel l2=new JLabel("ID");
        JTextField t1=new JTextField();

        JLabel l3=new JLabel("First Name");
        JTextField t2=new JTextField();

        JLabel l4=new JLabel("Middle Name");
        JTextField t3=new JTextField();

        JLabel l5=new JLabel("Last name");
        JTextField t4=new JTextField();

        JLabel l6=new JLabel("City");
        String City[]={"Jalgaon","Nashik","Nagpure","Aurangabad","Pachora","Pune","Mumbai","Chopada"};
        JComboBox c1=new JComboBox(City);

        JLabel l7=new JLabel("Address");
        JTextField  t5=new JTextField(50);

        JLabel l8=new JLabel("Batch");
        String Batch[]={"CO", "IT", "MEC"};
        JComboBox c2=new JComboBox(Batch);

        JLabel l9=new JLabel("Email");
        JTextField t6=new JTextField();

        JLabel l10 = new JLabel("Phone number");
        JTextField t7 = new JTextField();

        l1.setBounds(280,10,190,50);

        l1.setFont(new Font("BOLD",Font.ITALIC,21));

        l2.setBounds(30,50,90,50);
        t1.setBounds(120,65,110,20);

        l3.setBounds(30,100,90,50);
        t2.setBounds(120,115,110,20);

        l4.setBounds(30,160,90,30);
        t3.setBounds(120,165,110,20);

        l5.setBounds(30,215,90,20);
        t4.setBounds(120,215,110,20);

        l6.setBounds(30,255,90,50);
        c1.setBounds(120,270,110,20);

        l7.setBounds(30,320,90,20);
        t5.setBounds(120,315,110,70);

        l8.setBounds(30,420,90,20);
        c2.setBounds(120,420,110,20);

        l9.setBounds(270,65,110,20);
        t6.setBounds(360,65,140,20);

        l10.setBounds(270,115,110,20);
        t7.setBounds(360,115,140,20);

        f5.add(l1);

        f5.add(l2);
        f5.add(t1);

        f5.add(l3);
        f5.add(t2);

        f5.add(l4);
        f5.add(t3);

        f5.add(l5);
        f5.add(t4);

        f5.add(l6);
        f5.add(c1);

        f5.add(l7);
        f5.add(t5);

        f5.add(l8);
        f5.add(c2);


        f5.add(l9);
        f5.add(t6);

        f5.add(l10);
        f5.add(t7);

        f5.setSize(700,700);
        f5.setVisible(true);
        f5.setResizable(false);
    }
}
