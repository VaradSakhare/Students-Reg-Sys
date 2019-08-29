package com.jetbrains;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add {

    public void caller(){
            JFrame f3=new JFrame("Add frame");
            JLabel l1=new JLabel("Add STUDENT");
            JLabel l2=new JLabel("ID");

            final JTextField t1=new JTextField();
            JLabel l3=new JLabel("First Name");

            final JTextField t2=new JTextField();
            JLabel l4=new JLabel("Middle Name");

            final  JTextField t3=new JTextField();
            JLabel l5=new JLabel("Last name");

            final JTextField t4=new JTextField();
            JLabel l6=new JLabel("City");

            String City[]={"Jalgaon","Nashik","Nagpure","Aurangabad","Pachora","Pune","Mumbai","Chopada"};
            JComboBox c1=new JComboBox(City);

            JLabel l7=new JLabel("Address");
            JTextArea  t5=new JTextArea();

            JLabel l8=new JLabel("Batch");
            String Batch[]={"CO", "IT", "MEC"};
            JComboBox c2=new JComboBox(Batch);

            JLabel l9=new JLabel("Email");
            final JTextField t6=new JTextField();

            JLabel l10 = new JLabel("Phone number");
            final JTextField t7 = new JTextField();

            JButton b1 = new JButton("OK");
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

            b1.setBounds(250,530,110,20);


            f3.add(l1);

            f3.add(l2);
            f3.add(t1);

            f3.add(l3);
            f3.add(t2);

            f3.add(l4);
            f3.add(t3);

            f3.add(l5);
            f3.add(t4);

            f3.add(l6);
            f3.add(c1);

            f3.add(l7);
            f3.add(t5);
            f3.add(l8);
            f3.add(c2);


            f3.add(l9);
            f3.add(t6);

            f3.add(l10);
            f3.add(t7);

            f3.add(b1);
            b1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String s3 = t2.getText();
                    String s4 = t3.getText();
                    String s5 = t4.getText();
                    String s6 = t6.getText();
                    String s7 = t7.getText();
                    if(t2.getText().isEmpty()){
                        JOptionPane.showMessageDialog(null,"First name is empty");
                    }
                    else if(s4.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Middle name is empty");
                    }
                    else if(s5.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Last name is empty");
                    }
                    else if(s6.isEmpty()){
                        JOptionPane.showMessageDialog(null,"Email Address is empty");
                    }
                    else if(s7.length()>11){
                        JOptionPane.showMessageDialog(null,"Phone number is Digit above 10 ");
                    }

                }
            });
            f3.setLayout(null);
            f3.setSize(700,700);
            f3.setVisible(true);
            f3.setResizable(false);

        }
    }
