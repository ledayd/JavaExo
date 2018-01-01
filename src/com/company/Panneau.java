package com.company;

import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Panneau extends JPanel implements Scrollable {

    int i = 50;

    ArrayList<String> enCasdeSubdivision = new ArrayList<>();

    JTextPane textPane = new JTextPane();
    JTextPane textPane2 = new JTextPane();
    JScrollPane pane = new JScrollPane(this);

    {

    }


    public void paintComponent(Graphics g) {

        //this.add(pane);


        Font font = new Font("Courier", Font.BOLD, 40);
        g.setFont(font);
        g.drawString("DEVIS", 600, 50);
        Font font2 = new Font("Courier", Font.BOLD, 18);
        g.setFont(font2);
        g.drawString("numéro du devis: " + Main.devis.getToken(), 600, 90);
        g.drawString("intitulé du devis: " + Main.devis.getNumero(), 600, 110);


        //Company
        g.drawString(Main.devis.getCompany().getName() + "", 60, 150);
        g.drawString(Main.devis.getCompany().getAddress() + "", 60, 170);
        g.drawString(Main.devis.getCompany().getPostalCode() + " " + Main.devis.getCompany().getCity(), 60, 190);
        g.drawString("Tél: " + Main.devis.getCompany().getPhoneNumber() + "", 60, 210);
        g.drawString("@: " + Main.devis.getCompany().getEmail() + "", 60, 230);
        g.drawString("siret: " + Main.devis.getCompany().getFormattedSiret(), 60, 250);
        Image image = null;
        ImageIcon imageIcon;// = new ImageIcon();
        try {
            URL url = new URL(Main.devis.getCompany().getLogoUrl());
            image = ImageIO.read(url);
//            imageIcon = new ImageIcon(image);
//            imageIcon.paintIcon(this,g,60,170);
            Image dimg = image.getScaledInstance(300, 80, Image.SCALE_SMOOTH);
            g.drawImage(dimg, 60, 50, this);

        } catch (IOException e) {
        }

        //client
        g.drawString("CLIENT / CHANTIER :", 650, 270);
        g.drawString(Main.devis.getChantier().getCustomerName() + "", 650, 290);

        g.drawString("Adresse du Chantier: " + Main.devis.getChantier().getChantierAddress() + "", 650, 310);
        g.drawString(Main.devis.getChantier().getChantierPostalCode() + " " + Main.devis.getChantier().getChantierCity(), 650, 330);

        g.drawString("Adresse de Facturation: " + Main.devis.getChantier().getBillingAddress() + "", 650, 350);
        g.drawString(Main.devis.getChantier().getBillingPostalCode() +
                " " + Main.devis.getChantier().getBillingCity() + "", 650, 370);

//---------------
        //corps du devis:

        g.drawString("OBJET DU DEVIS: " + Main.devis.getTitle() + ".", 60, 450);

        textPane.setBounds(130, 480, 800, 130);
        StyledDocument doc = textPane.getStyledDocument();
        SimpleAttributeSet style_normal = new SimpleAttributeSet();
        StyleConstants.setFontFamily(style_normal, "Calibri");
        StyleConstants.setFontSize(style_normal, 12);
        try {
            doc.insertString(doc.getLength(), Main.devis.getIntroductionLetter(), style_normal);

        } catch (BadLocationException e) {
            e.printStackTrace();
        } finally {
            this.add(textPane);
        }

//        textPane2.setBounds(130, 680, 800, 160);
//        StyledDocument doc2 = textPane2.getStyledDocument();
//        SimpleAttributeSet style_normal2 = new SimpleAttributeSet();
//        StyleConstants.setFontFamily(style_normal, "Calibri");
//        StyleConstants.setFontSize(style_normal, 14);
//        try {
//            doc.insertString(doc.getLength(), Main.devis.getIntroductionLetter(), style_normal2);
//
//        } catch (BadLocationException e) {
//            e.printStackTrace();
//        }
//        finally {
//            this.add(textPane2);
//        }


//
        g.drawString("LIGNE DU DEVIS: ", 60, 630);
//        Main.jScrollPane = new JScrollPane(this);
//        this.add(Main.jScrollPane);
        int i = 635;
        int j = 0;

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("designation");
        model.addColumn("description");
        model.addColumn("prixUnitaireHT");
        model.addColumn("quantite");
        model.addColumn("prixHT");
        JTable table = new JTable(model);
        model.addRow(new Object[]{table.getColumnName(0), table.getColumnName(1), table.getColumnName(2), table.getColumnName(3), table.getColumnName(4)});
        model.addRow(new Object[]{"","","","",""});

        //table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        for (int k = 0; k <table.getColumnCount() ; k++) {
            table.getColumnModel().getColumn(k).setPreferredWidth(220);
        }

        StyleConstants.setFontFamily(style_normal, "Calibri");
        StyleConstants.setFontSize(style_normal, 9);

        String designation = "";
        String label = "";
        String prixUnitaireHT = "";
        String description = " ";
        String quantite = "";
        String prixHT = "";


        for (Section section : Main.devis.getSections()
                ) {

            for (Lot lot : section.getLots()
                    ) {
                j = 0;
//                textPane.setBounds(60 + j*20 , i, 20, 20);
//                try {
//                    doc.insertString(doc.getLength(), lot.getLabel(), style_normal);
//
//                } catch (BadLocationException e) {
//                    e.printStackTrace();
//                } finally {
//                    this.add(textPane);
//                }
                //g.drawString(lot.getLabel(),60 + j*20, i);


                label = lot.getLabel();


                for (Ligne ligne : lot.getLignes()
                        ) {
                    j++;

//                    textPane.setBounds(60 + j*20 , i, 20, 20);
//                    try {
//                        doc.insertString(doc.getLength(), ligne.getDesignation(), style_normal);
//
//                    } catch (BadLocationException e) {
//                        e.printStackTrace();
//                    } finally {
//                        this.add(textPane);
//                    }

                    //g.drawString(ligne.getDesignation(),60 + j*20, i);


                    designation = ligne.getDesignation();

                    j++;

                    //if (description.length()<= ligne.getDescription().length()){description = ligne.getDescription();}
                    if (ligne.getDescription() == null) {
                        description = "";
                    } else {
                        description = ligne.getDescription();
                    }

//                    textPane.setBounds(60 + j*20 , i, 20, 20);
//                    try {
//                        doc.insertString(doc.getLength(), description, style_normal);
//
//                    } catch (BadLocationException e) {
//                        e.printStackTrace();
//                    } finally {
//                        this.add(textPane);
//                    }

                    //g.drawString(description,60 + j*20, i);


                    j++;

                    //textPane.setBounds(60 + j * 20, i, 20, 20);
//                    try {
//                        doc.insertString(doc.getLength(), ligne.getPrixUnitaireHT().toString(), style_normal);
//
//                    } catch (BadLocationException e) {
//                        e.printStackTrace();
//                    } finally {
//                        this.add(textPane);
//                    }

                    //g.drawString(ligne.getPrixUnitaireHT().toString(),60 + j*20, i);
                    prixUnitaireHT = String.valueOf(ligne.getPrixUnitaireHT());


                    j++;

//                    textPane.setBounds(60 + j*20 , i, 20, 20);
//                    try {
//                        doc.insertString(doc.getLength(), ligne.getQuantite().toString(), style_normal);
//
//                    } catch (BadLocationException e) {
//                        e.printStackTrace();
//                    } finally {
//                        this.add(textPane);
//                    }

                    //g.drawString(ligne.getQuantite().toString(),60 + j*20, i);

                    quantite = String.valueOf(ligne.getQuantite());
                    j++;

                    prixHT = String.valueOf(ligne.getPrixHT());

                    j++;
                }

//                textPane.setBounds(60 + j*20 , i, 20, 20);
//                try {
//                    doc.insertString(doc.getLength(), lot.getPrixTotalHT().toString(), style_normal);
//
//                } catch (BadLocationException e) {
//                    e.printStackTrace();
//                } finally {
//                    this.add(textPane);
//                }

                //g.drawString(lot.getPrixTotalHT().toString(),60 + j*20,i);
                //DefaultTableModel model = (DefaultTableModel) table.getModel();

                model.addRow(new Object[]{designation, description, prixUnitaireHT, quantite, prixHT});
                i = i + 25;

//                for (String label: lot.getLab
//                     ) {
//
//                }

            }

        }

        table.setBounds(100, 690, 800, 800);
        this.add(table);
        System.out.println(table.getAutoResizeMode());
        //table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
        System.out.println(table.getAutoResizeMode());

    }




    @Override
    public Dimension getPreferredScrollableViewportSize() {
        return null;
    }

    @Override
    public int getScrollableUnitIncrement(Rectangle visibleRect, int orientation, int direction) {
        return 1;
    }

    @Override
    public int getScrollableBlockIncrement(Rectangle visibleRect, int orientation, int direction) {
        return 1;
    }

    @Override
    public boolean getScrollableTracksViewportWidth() {
        return true;
    }

    @Override
    public boolean getScrollableTracksViewportHeight() {
        return true;
    }
}


