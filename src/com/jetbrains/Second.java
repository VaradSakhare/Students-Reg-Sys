package com.jetbrains;

import sun.plugin.javascript.navig.Image;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Second {

    public void callf2() {

        final JFrame f2 = new JFrame("Second Frame");
        JButton b1=new JButton("ADD ");
        JButton b2=new JButton("Delete");
        JButton b3=new JButton("Modify");
        JButton b4=new JButton("Shows");
        b1.setBounds(200,170,220,40);
        b2.setBounds(200,220,220,40);
        b3.setBounds(200,270,220,40);
        b4.setBounds(200,320,220,40);
        f2.add(b1);
        f2.add(b2);
        f2.add(b3);
        f2.add(b4);
        f2.setLayout(null);
        f2.setResizable(false);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Add t1 = new Add();
                f2.setVisible(false);
                t1.caller();
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Delete t1 = new Delete();
                f2.setVisible(false);
                t1.calling();
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Modify t1 = new Modify();
                f2.setVisible(false);
                t1.calls();
            }
        });
        f2.setVisible(true);
        f2.setSize(700,700);

    }

}
