package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Scanner;

class Main2 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ButtonDemo();
            }
        });

    }
}

class ButtonDemo implements ActionListener {
    JLabel jLab, jLab2;
    JTextField jTextField;

    ButtonDemo() {

        JFrame jFrame = new JFrame("Świąteczna loteria!!");

        jFrame.setLayout(new FlowLayout());

        jFrame.setSize(500, 250);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jTextField = new JTextField(10);

        jTextField.setActionCommand("myTF");

        JButton jButtonLosuj = new JButton("Losuj!");

        jButtonLosuj.addActionListener(this);
        jTextField.addActionListener(this);

        jLab = new JLabel("Naciśnij przycisk");
        jLab2 = new JLabel("Wpisz swoje imię, używając tylko WIELKICH LITER");

        jFrame.add(jLab2);
        jFrame.add(jTextField);
        jFrame.add(jLab);
        jFrame.add(jButtonLosuj);

        jFrame.setVisible(true);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Losuj!")) {
            /*Scanner scanner = new Scanner(System.in);
            String wpisaneImie = scanner.nextLine();
            String ola = "OLA";
            String ania = "ANIA";
            String piotrek = "PIOTREK";
            String ewelina = "EWELINA";
            String maciek = "MACIEK";
            String grzesiek = "GRZESIEK";
            String magda = "MAGDA";
            String tomek = "TOMEK";*/

            //jLab.setText("tra");
            /*if (wpisaneImie.equals(ola)) {
                jLab.setText("Brawo wylosowałaś Grześka!! Kup mu coś milutkiego i smacznego do jedzonka!! Ho! Ho! Ho!");
            }*/

        }
    }



}
