package test;

import java.io.IOException;
import java.util.Scanner;

class Help {
    public static void main(String[] args) throws IOException {
        //char choice;
        System.out.println("Information about the syntax of the instruction:");
        System.out.println("1. if");
        System.out.println("2. switch");
        System.out.println("Select the instruction number: ");

        //choice = (char) System.in.read();
        Scanner scanner = new Scanner(System.in);
        int myChoice = scanner.nextInt();

        switch (myChoice){
            case 1:
                System.out.println("Instrukcja warunkowa if:\n");
                System.out.println("if(warunek) instrukcja;");
                System.out.println("else instrukcja:");
                break;
            case 2:
                System.out.println("Instruckja warunkowa switch:\n");
                System.out.println("switch(wyrażenie) {");
                System.out.println("case stała: ");
                System.out.println("instruckcje;");
                System.out.println("break;");
                System.out.println("}");
                break;
            default:
                System.out.println("Wrong choice");
        }

        double i, sqr, err;

        //element sqr from 1 to 100
        for (i = 0; i <100; i++) {
            sqr = Math.sqrt(i);
            System.out.println(sqr);

            err = i - (sqr * sqr);
            System.out.println("Error: " + err);
        }


        for (int j = 100; -100<j; j-=5){
            System.out.println(j);
        }

        int r, o;
        for (r = 0, o = 10; r < o; r++, o--){
            System.out.println("Tralala " + r + " " + o);
        }

        for (int f = 0; (char)System.in.read() != 'T' ;++f){
            System.out.println(f);
        }

    }
}
