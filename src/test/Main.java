package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.IOException;
import java.util.Scanner;
import java.util.SplittableRandom;

class Main implements ActionListener {
    public static void main(String[] args) {

        /*int[] nums = {99, -10, 100123, 18, -978, 5623, 463, -9, 287, 49};*//* = new int[10];*//*
        int min, max;

        *//*nums[0] = 99;
        nums[1] = -10;
        nums[2] = 100123;
        nums[3] = 18;
        nums[4] = -978;
        nums[5] = 5623;
        nums[6] = 463;
        nums[7] = -9;
        nums[8] = 287;
        nums[9] = 49;*//*

        min = max = nums[0];
        for (int i = 1; i<nums.length; i++){
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }

        System.out.println("Max is: " + max + '\n' + "Min is: " + min);

        int size = 10;
        for (int a = 1; a<size; a++){
            for (int b = size-1; b>=a; b--){
                if (nums[b-1] > nums[b]){
                 int t = nums[b-1];
                 nums[b-1] = nums[b];
                 nums[b] = t;
                }
            }
        }
        System.out.println("Posortowana tablica: ");
        for (int i = 0; i<nums.length; i++) {
            System.out.print(" " + nums[i]);
        }
        System.out.println();

        int b, c;
        int[][] tabTwo = new int[6][4];

        for (b = 0; b<6; b++){
            for (c = 0; c<4; c++){
                tabTwo[b][c] = (b*4)+c+1;
                System.out.print(tabTwo[b][c] + " ");
            }
            System.out.println();
        }*/
        /*System.out.println("Wpisz swoje imię WIELKIMI LITERAMI i wciśnij przycisk Losuj!!");
        Scanner scanner = new Scanner(System.in);
        String wpisaneImie = scanner.nextLine();*/

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Main();
            }
        });

       /* String ola = "OLA";
        String ania = "ANIA";
        String piotrek = "PIOTREK";
        String ewelina = "EWELINA";
        String maciek = "MACIEK";
        String grzesiek = "GRZESIEK";
        String magda = "MAGDA";
        String tomek = "TOMEK";

        try {
            switch (wpisaneImie){
                case "OLA":
                    System.out.println("Brawo wylosowałś Grześka!! Kup mu coś milutkiego i smacznego do jedzonka!! Ho! Ho! Ho!");
                    break;
                case "ANIA":
                    System.out.println("Brawo wylosowałaś Maćka!! Kup mu nowy rowerek do śmigania!! Abo cuś innego sportowego!! Ho! Ho! Ho!");
                    break;
                case "PIOTREK":
                    System.out.println("Brawo wylosowałeś Awelinkę!! Kup jej coś ładniutkiego!! Ho! Ho! Ho!");
                    break;
                case "MACIEK":
                    System.out.println("Brawo wylosowałeś swoją Żonkę Annę Narożnik!! Kup jej duży, piękny, błyszczący, pozłacany.. IXWING!! Ho! Ho! Ho!");
                    break;
                case "GRZESIEK":
                    System.out.println("Brawo wylosowałeś sowją Żonkę Aleksandrę Wilską-Wolską!! Kup jej drugiego orbitreka!! Ho! Ho! Ho!");
                    break;
                case "EWELINA":
                    System.out.println("Brawo wylosowałaś Piotrusia-Milusia!! Kup mu grzebyk do brody!! Ho! Ho! Ho!");
                    break;
                case "MAGDA":
                    System.out.println("Brawo wylosowałaś sowjego Mężusia-Tomusia!! Kup mu: bagażnik na rowery, smartzegarka, zewnętrzną kartę dzwiękową do laptopa, przejściówkę do słuchawek. Napewno się ucieszy! Ho! Ho! Ho!");
                    break;
                case "TOMEK":
                    System.out.println("Brawo wylosowałeś sowją Żonkę Magusię-Jagusię. Daj Jej całuska, napewno się usieszy! Ho! Ho! Ho!");
                    break;
            }

            if (wpisaneImie.equals(ola) || wpisaneImie.equals(ania) || wpisaneImie.equals(piotrek) || wpisaneImie.equals(ewelina) || wpisaneImie.equals(maciek)||
            wpisaneImie.equals(grzesiek) || wpisaneImie.equals(magda) || wpisaneImie.equals(tomek)) {
                System.out.println("Wesołych Świąt!! Hooo!! Hooo!! Hooo!! PS. Naprawdę wierzysz w Świętego Mikołaja...");
            } else {
                System.out.println("Nieprawidłowe dane. Grzeszysz!! Spróbuj jeszcze raz nicponiu!!");
            }*/
            /*if (wpisaneImie.equals(ania)) {
                System.out.println("Wyslosowałaś Maćka!! Brawo kup mu coś super ekstra!!");
            }
            if (wpisaneImie.equals(piotrek)) {
                System.out.println("Wyslosowałeś Ewelinę!! Brawo kup jej coś super ekstra!!");
            }
            if (wpisaneImie.equals(ewelina)) {
                System.out.println("Wyslosowałaś Piotrka!! Brawo kup mu coś super ekstra!!");
            }
            if (wpisaneImie.equals(maciek)) {
                System.out.println("Wyslosowałeś Anię!! Brawo kup jej coś super ekstra!!");
            }
            if (wpisaneImie.equals(grzesiek)) {
                System.out.println("Wyslosowałeś Olę!! Brawo kup jej coś super ekstra!!");
            }
            if (wpisaneImie.equals(magda)) {
                System.out.println("Wyslosowałaś Tomka!! Brawo kup mu coś super ekstra!!");
            }
            if (wpisaneImie.equals(tomek)) {
                System.out.println("Wyslosowałeś Magdę!! Brawo kup jej coś super ekstra!!");
            }*/
        /*}catch (Exception exe){
            System.out.println("Nieprawidłowe dane. Spróbuj jeszcze raz");
        }*/

    }

    //JLabel jLabelSelected;
    //JLabel jLabelChanged;
    //JCheckBox jCheckAlfa;
    //JCheckBox jCheckBeta;
    JTextField jTextField;
    JButton jButton;
    JLabel jLabelPrompt;
    JLabel jLabelPrompt2;
    JLabel jLabelContents;


    Main() {
        JFrame jFrame = new JFrame("Świąteczne losowanie!!");
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(550, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jTextField = new JTextField(10);
        jTextField.setActionCommand("myTF");
        JButton jButton = new JButton("Losuj!!");
        jTextField.addActionListener(this);
        jButton.addActionListener(this);
        jLabelPrompt = new JLabel("Wpisz swoje imię WIELKIMI LITERAMI i wciśnij przycisk Losuj!!");
        jLabelPrompt2 = new JLabel("Zaznacz odpowiednią kwotę");
        jLabelContents = new JLabel("");
        //jLabelSelected = new JLabel("");
        //jLabelChanged = new JLabel("");
        //jCheckAlfa = new JCheckBox("Kwota 0 zł");
        //jCheckBeta = new JCheckBox("Kwota 50 zł");
        //jCheckAlfa.addItemListener(this);
        //jCheckBeta.addItemListener(this);
        //jFrame.add(jCheckAlfa);
        jFrame.add(jLabelPrompt2);
        //jFrame.add(jCheckBeta);
        //jFrame.add(jLabelChanged);
        //jFrame.add(jLabelSelected);
        jFrame.add(jLabelPrompt);
        jFrame.add(jTextField);
        //jFrame.add(jButton);
        jFrame.add(jLabelContents);

        jFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Wpisz swoje imię WIELKIMI LITERAMI i wciśnij enter.")) {

            String orgStr = jTextField.getText();
            String resStr = "";

            String ola = "OLA";
            String ania = "ANIA";
            String piotrek = "PIOTREK";
            String ewelina = "EWELINA";
            String maciek = "MACIEK";
            String grzesiek = "GRZESIEK";
            String magda = "MAGDA";
            String tomek = "TOMEK";

            /*for (int i = orgStr.length()-1; i>=0; i--){
                resStr += orgStr.charAt(i);
            }*/

            //jTextField.setText(resStr);

                switch (orgStr) {
                    case "OLA":
                        resStr = ("Brawo wylosowałaś Grześka!! Kup mu coś milutkiego i smacznego do jedzonka!! Ho! Ho! Ho!");
                        jLabelContents.setText(resStr + " " + jTextField.getText());
                        break;
                    case "ANIA":
                        resStr = ("Brawo wylosowałaś Maćka!! Kup mu nowy rowerek do śmigania!! Abo cuś innego sportowego!! Ho! Ho! Ho!");
                        jLabelContents.setText(resStr + " " + jTextField.getText());
                        break;
                    case "PIOTREK":
                        resStr = ("Brawo wylosowałeś Awelinkę!! Kup jej coś ładniutkiego!! Ho! Ho! Ho!");
                        jLabelContents.setText(resStr + " " + jTextField.getText());
                        break;
                    case "MACIEK":
                        resStr = ("Brawo wylosowałeś swoją Żonkę Annę Narożnik!! Kup jej duży, piękny, błyszczący, pozłacany.. IXWING!! Ho! Ho! Ho!");
                        jLabelContents.setText(resStr + " " + jTextField.getText());
                        break;
                    case "GRZESIEK":
                        resStr = ("Brawo wylosowałeś sowją Żonkę Aleksandrę Wilską-Wolską!! Kup jej drugiego orbitreka!! Ho! Ho! Ho!");
                        jLabelContents.setText(resStr + " " + jTextField.getText());
                        break;
                    case "EWELINA":
                        resStr = ("Brawo wylosowałaś Piotrusia-Milusia!! Kup mu grzebyk do brody!! Ho! Ho! Ho!");
                        jLabelContents.setText(resStr + " " + jTextField.getText());
                        break;
                    case "MAGDA":
                        resStr = ("Brawo wylosowałaś sowjego Mężusia-Tomusia!! Kup mu: bagażnik na rowery, smartzegarka, zewnętrzną kartę dzwiękową do laptopa, przejściówkę do słuchawek. Napewno się ucieszy! Ho! Ho! Ho!");
                        jLabelContents.setText(resStr + " " + jTextField.getText());
                        break;
                    case "TOMEK":
                        resStr = ("Brawo wylosowałeś sowją Żonkę Magusię-Jagusię. Daj Jej całuska, napewno się usieszy! Ho! Ho! Ho!");
                        jLabelContents.setText(resStr + " " + jTextField.getText());
                        break;
                }

            System.out.println(orgStr);

            /*if (orgStr.equals(ola) || orgStr.equals(ania) || orgStr.equals(piotrek) || orgStr.equals(ewelina) || orgStr.equals(maciek) ||
                    orgStr.equals(grzesiek) || orgStr.equals(magda) || orgStr.equals(tomek)) {
                resStr = ("Wesołych Świąt!! Hooo!! Hooo!! Hooo!! PS. Naprawdę wierzysz w Świętego Mikołaja...");
            } else {
                resStr = ("Nieprawidłowe dane. Grzeszysz!! Spróbuj jeszcze raz nicponiu!!");
            }

            jTextField.setText(resStr);*/


        } //else jLabelContents.setText("Nacisnąłeś Enter. Tekst: " + jTextField.getText());
    }


    /*public void itemStateChanged(ItemEvent ie) {
        String str = "";
        JCheckBox cb = (JCheckBox) ie.getItem();
        if (cb.isSelected()) jLabelChanged.setText(cb.getText() + " zostało zaznaczone.");
        else jLabelChanged.setText(cb.getText() + ": zaznaczenie zostało usunięte.");

        *//*if (jCheckAlfa.isSelected()){
            str += "Kwota 0 zł ";
        }*//*
        if (jCheckBeta.isSelected()) {
            str += "Kwota 50 zł ";
        }*/

    //jLabelSelected.setText("To pole jest wybrane: " + str);

}
