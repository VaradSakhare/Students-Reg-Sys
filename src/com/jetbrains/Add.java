package com.jetbrains;

import com.sun.xml.internal.fastinfoset.util.QualifiedNameArray;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static javafx.scene.input.KeyCode.G;

class Add extends JFrame {
    public void caller() {
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        JPanel p2 = new JPanel();
        JPanel p3 = new JPanel();
        p3.setLayout(null);
        JTabbedPane tf = new JTabbedPane();


        // Start From Persoonal Detais\\

        JLabel l1 = new JLabel("Add STUDENT");
        JLabel l2 = new JLabel("ID");
        JTextField ID_t1 = new JTextField();

        JLabel l3 = new JLabel("First Name");
        final JTextField First_t2 = new JTextField();

        JLabel l4 = new JLabel("Middle Name");
        final JTextField Middle_t3 = new JTextField();

        JLabel l5 = new JLabel("Last Name");
        final JTextField Last_t4 = new JTextField();

        JLabel l6 = new JLabel("City");
        String City[] = {"Select City", "Jalgaon", "Nashik", "Nagpure", "Aurangabad", "Pachora", "Pune", "Mumbai", "Chopada"};
        JComboBox city_c1 = new JComboBox(City);

        JLabel l7 = new JLabel("Address");
        final JTextArea Address_t5 = new JTextArea();

        JLabel l8 = new JLabel("Batch");
        String Batch[] = {"Select Branch", "CO", "IT", "MEC", "EE", "EJ"};
        JComboBox Batch_c2 = new JComboBox(Batch);

        JLabel l9 = new JLabel("PinCode");
        final JTextField Pin_t6 = new JTextField();

        JLabel l10 = new JLabel("Phone no");
        final JTextField Phone_t7 = new JTextField();

        JLabel l11 = new JLabel("gua.Phone");
        final JTextField gua_t8 = new JTextField();

        JLabel l12 = new JLabel("Email");
        final JTextField Email_t9 = new JTextField();

        JLabel l13 = new JLabel("Password");
        final JPasswordField pass_t10 = new JPasswordField();

        JLabel l14 = new JLabel("Re-Paswd");
        final JPasswordField repass_t11 = new JPasswordField();

          // Start from  Course details  \\

        JLabel l15 = new JLabel("Current course of Admission Year");
        String Admission[] = {"Select Year", "2011", "2012", "2013", "2014","2015","2016","2017"
        ,"2018","2019","2020"};
        JComboBox Admission_c3 = new JComboBox(Admission);

        JLabel l16 = new JLabel("Institute State ");
        String States[] = {"Select State", "Andhra Pradesh ", "Assam", "Bihar", "Delhi","Gujarat"
                ,"Kerala","Maharashatra","Madhya Pradesh","Punjab","Rajashatan"};
        JComboBox States_c4 = new JComboBox(States);

        JLabel l17 = new JLabel("Institute Taluka");
        String Taluka[] = {"Select Taluka", "Jalagaon", "Pachora", "Yawal", "Jamner","Parola",
                "Bhusawal","Chopda","Amalner"};
        JComboBox Taluka_c5 = new JComboBox(Taluka);

        JLabel l18 = new JLabel("College Name");
        String College[] = {"Shri Gulabarav Devakar,Jalgaon","G.H Raisoni Polytenchnic,Jalgaon","Government" +
                "Polytechnic,Jalgaon","G.H Raisoni Institute of Management and Engineering","K.C.E Socitys" +
                "College of Engineering,Jalgaon"};
        JComboBox Colleges_c6 = new JComboBox(College);

        JLabel l19 = new JLabel("Course Name");
        String Courses[] = {"Computer Engineering","Mechanical Engineering","Electical Engineering"};
        JComboBox Courses_c7 = new JComboBox(Courses);

        JLabel l20  = new JLabel("Year of study");
        String Years[] = {"First Year","Second Year","Third Year","Direct First Year","Direct Second Year"
        ,"Direct Third Year"};
        JComboBox Years_c8 = new JComboBox(Years);

        JLabel l21 =  new JLabel("Qualifi Details");
        String Qualifications[] = {"Diploma Course","Certificate Course","PH.D","H.S.C 12TH" +
                "F.Y.J.C 11th"};
        JComboBox Qualifications_c9 = new JComboBox(Qualifications);

        //Personal details

        JButton b1 = new JButton("Submit");

        l1.setBounds(180, 8, 190, 50);
        l1.setFont(new Font("BOLD", Font.ITALIC, 21));
        l2.setBounds(30, 50, 90, 50);
        ID_t1.setBounds(100, 65, 110, 20);

        l3.setBounds(30, 100, 90, 50);
        First_t2.setBounds(100, 115, 110, 20);

        l4.setBounds(28, 160, 90, 30);
        Middle_t3.setBounds(100, 165, 110, 20);

        l5.setBounds(30, 215, 90, 20);
        Last_t4.setBounds(100, 215, 110, 20);

        l6.setBounds(30, 255, 90, 50);
        city_c1.setBounds(100, 270, 110, 20);

        l7.setBounds(30, 320, 90, 20);
        Address_t5.setBounds(100, 315, 110, 70);

        l8.setBounds(243, 65, 90, 20);
        Batch_c2.setBounds(310, 65, 130, 20);

        l9.setBounds(245, 115, 120, 20);
        Pin_t6.setBounds(310, 119, 140, 20);

        l10.setBounds(245, 165, 110, 20);
        Phone_t7.setBounds(310, 163, 140, 20);

        l11.setBounds(245, 210, 110, 20);
        gua_t8.setBounds(310, 213, 140, 20);

        l12.setBounds(245, 267, 110, 20);
        Email_t9.setBounds(310, 267, 140, 20);

        l13.setBounds(245,315,110,20);
        pass_t10.setBounds(310,315,140,20);

        l14.setBounds(247,375,110,20);
        repass_t11.setBounds(310,375,140,20);

        b1.setBounds(215, 460, 100, 20);

        //Course

        l15.setBounds(30, 50, 100, 50);
        Admission_c3.setBounds(130, 65, 110, 20);

        l16.setBounds(30, 101, 90, 50);
        States_c4.setBounds(130, 115, 110, 20);

        l17.setBounds(30, 160, 90, 20);
        Taluka_c5.setBounds(130, 165, 110, 20);

        l18.setBounds(30, 215, 90, 20);
        Colleges_c6.setBounds(130, 215, 115, 22);

        l19.setBounds(260, 65, 90, 20);
        Courses_c7.setBounds(360, 65, 150, 20);

        l20.setBounds(260, 115, 120, 20);
        Years_c8.setBounds(360, 119, 140, 20);

        l21.setBounds(260, 165, 110, 20);
        Qualifications_c9.setBounds(360, 163, 140, 20);

        p1.add(l1);
        p1.add(l2);
        p1.add(ID_t1);
        p1.add(l3);
        p1.add(First_t2);
        p1.add(l4);
        p1.add(Middle_t3);
        p1.add(l5);
        p1.add(Last_t4);
        p1.add(l6);
        p1.add(city_c1);
        p1.add(l7);
        p1.add(Address_t5);
        p1.add(l8);
        p1.add(Batch_c2);
        p1.add(l9);
        p1.add(Pin_t6);
        p1.add(l10);
        p1.add(Phone_t7);
        p1.add(l11);
        p1.add(gua_t8);
        p1.add(l12);
        p1.add(Email_t9);
        p1.add(l13);
        p1.add(pass_t10);
        p1.add(l14);
        p1.add(repass_t11);
        p1.add(b1);

        //Course

        p3.add(l15);
        p3.add(Admission_c3);
        p3.add(l16);
        p3.add(States_c4);
        p3.add(l17);
        p3.add(Taluka_c5);
        p3.add(l18);
        p3.add(Colleges_c6);
        p3.add(l19);
        p3.add(Courses_c7);
        p3.add(l20);
        p3.add(Years_c8);
        p3.add(l21);
        p3.add(Qualifications_c9);

        tf.add("Personal Details", p1);
        tf.add("Other Details", p2);
        tf.add("Course Details", p3);

        add(tf);
        setVisible(true);
        setSize(700, 600);
        setResizable(false);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s3 = First_t2.getText();
                String s4 = Middle_t3.getText();
                String s5 = Last_t4.getText();
                String s6 = Address_t5.getText();
                String s7 = Pin_t6.getText();
                String s8 = Phone_t7.getText();
                String s9 = gua_t8.getText();
                String s10 = Email_t9.getText();
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