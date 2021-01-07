package test;

import java.io.IOException;
import java.util.Scanner;

class TestNext {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello world");
        }

        //diagonal rectangle - przekątna prostokąta
        int d = 0;
        int l = 4;
        int w = 10;
        d = (l * l) + (w * w);

        System.out.println("Diagonal rectangle: " + Math.sqrt(d));

        int numberOne = 2;
        System.out.println(numberOne);
        int numberTwo = 4;
        int scoreAddition = 0;
        int scoreSubtraction = 0;
        int scoreMultiplication = 0;
        int scoreDivision = 0;

        System.out.println(scoreAddition = numberOne + numberTwo);
        System.out.println(scoreSubtraction = numberOne - numberTwo);
        System.out.println(scoreMultiplication = numberOne * numberTwo);
        System.out.println(scoreDivision = numberOne / numberTwo);

        ++numberOne;
        System.out.println(numberOne);

        System.out.println(numberOne % 2);
        System.out.println(numberOne / numberTwo);

        double a = 15;
        double b = 3;
        double c = 2;
        double sum = a / b * c;
        System.out.println(sum);

        double g = 2;

        System.out.println(g + g * g);

        System.out.println((g + g) * g);

        String world = "Kanada";
        if (world.equals("Ameryka")) {
            System.out.println("Witaj Ameryko!");
        } else System.out.println("Witaj świecie");

        int p = 2;
        if (p == 2) {
            System.out.println("Number is equal: 2");
        }
        if (p % 2 == 0) {
            System.out.println("Number is even");
        }
        if (p % 2 != 0) {
            System.out.println("Number is not even");
        }

        int o = 2;
        int q = 11;
        if (o == 2) {
            if (q == 11) {
                System.out.println(o + q);
            }
        }

        String homeMy = "Tajlandia";

        if (homeMy == "Japonia") {
            System.out.println("Hello Japonia!");
        } else if (homeMy == "Tajlandia") {
            System.out.println("Hello Tajlandia!");
        } else if (homeMy == "India") {
            System.out.println("Hello India!");
        } else if (homeMy == "Chiny") {
            System.out.println("Hello Chiny!");
        } else {
            System.out.println("Hello world!");
        }


        char r;
        char answer = 'K';
        //Scanner scanner = new Scanner(System.in);
        //String enterWorld = scanner.nextLine();
        r = (char) System.in.read();
        if (r == answer) {
            System.out.println("Good!!!");
        } else {
            System.out.println("Not good!!");

            if (r > answer)
                System.out.println("Too loow!!");
            else if (r < answer)
                System.out.println("Too high!!");
        }

        int gr;
        for (gr = 1; gr < 6; gr++){
            if (gr == 1){
                System.out.println("gr equal: 1");
            } else if (gr == 2){
                System.out.println("gr equal: 2");
            } else if (gr == 3){
                System.out.println("gr equal: 3");
            } else if (gr == 4){
                System.out.println("gr equal: 4");
            } else System.out.println("gr not belongs to range 1 - 4");
        }

        int z;
        for (z = 0; z<10; z++) {
            switch (z) {
                case 1:
                    System.out.println("z equals 1");
                    break;
                case 2:
                    System.out.println("z equals 2");
                    break;
                case 3:
                    System.out.println("z equals 3");
                default:
                    System.out.println("z isn't equals");
            }
        }

        int myNumberOne = 1;
        while (myNumberOne < 10){
            switch (myNumberOne){
                case 1:
                    System.out.println("My number equals 1");
                    break;
                case 2:
                    System.out.println("My number equals 2");
                    //break;
                case 3:
                    System.out.println("My number equals 3");
                    //break;
                case 4:
                    System.out.println("My number equals 4");
                    //break;
                case 5:
                    System.out.println("My number equals 5");
                    //break;
                case 6:
                    System.out.println("My number equals 6");
                    //break;
                case 7:
                    System.out.println("My number equals 7");
                    break;
                case 8:
                    System.out.println("My number equals 8");
                    break;
                case 9:
                    System.out.println("My number equals 9");
                default:
                    System.out.println("My number not equals");
            }
            myNumberOne++;
        }

    }
}