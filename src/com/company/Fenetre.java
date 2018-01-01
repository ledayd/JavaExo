package com.company;


import javax.swing.*;

/**
 * Created by apple on 20/12/2017.
 */
public class Fenetre extends JFrame {
    public Fenetre(){
        this.setTitle("Votre Devis");
        this.setSize(1000, 500);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}