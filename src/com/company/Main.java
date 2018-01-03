package com.company;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {


    public static Devis devis;

    private static String link = "https://api.travauxlib.com/api/devis-pro/7viOoR4HnCTONZ5uGR02XEKQoNm4u6";

    public static String data="";





    public static void main(String[] args) {
        // write your code here

        try {
            URL url = new URL(link);
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            //String data = "";
            String line;
            /*
            while((line = reader.readLine()) != null){
                data += line;
            }
            */
            while((line = reader.readLine()) != null){
                data+=line;
            }
            //System.out.println(data);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(data);



        Gson gson = new GsonBuilder().create();


        devis = gson.fromJson(data, Devis.class);

        System.out.println(devis.getToken());
        System.out.println(devis.getCompany().toString());

        JFrame fenetre = new JFrame();
        fenetre.setVisible(true);


        fenetre.setTitle("Votre Devis");
        fenetre.setSize(1800, 1500);
        fenetre.setLocationRelativeTo(null);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenetre.setResizable(true);
        Panneau pan = new Panneau();

       // fenetre.getContentPane().add(jScrollPane);
        pan.setLayout(new GridBagLayout());


        pan.setBackground(Color.white);
        JScrollPane jScrollPane = new JScrollPane(pan);
         jScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);


        fenetre.getContentPane().add(jScrollPane);
        fenetre.setContentPane(pan);
//        fenetre.getContentPane().add(jScrollPane);
        //pan.add(jScrollPane);


//        JPanel container = new JPanel();
//        JScrollPane scrPane = new JScrollPane(container);
//        add(scrPane);












    }
}
