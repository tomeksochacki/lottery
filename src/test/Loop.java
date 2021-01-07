package test;

import java.io.IOException;

class Loop {
    public static void main(String[] args) throws IOException {
        /*for (int i = 0; (char) System.in.read() != 'R'; i++) {
            System.out.println(i);
            System.out.println("break");
        }*/

        /*for (; ; ) {
            System.out.println("Empty");
        }*/

        /* for (int k = 0; k<10; ) {
            System.out.println(k);
            k++;
        }*/

        int t;
        t = 0;
        for ( ;t<10; ){
            System.out.println(t);
            t++;
        }
        int sum = 0;
        for (int i = 1; i<=5; sum += i++);
        System.out.println(sum);

        /*sum += i++
        sum = sum + i;
        i++;*/

        /*double mySum = 0;
        double myFactorial = 1;

        for (int k = 0; k<5; k++){
            mySum = mySum + k;
            myFactorial = myFactorial * k;
        }
        System.out.println(mySum);
        System.out.println(myFactorial);*/


        char i = 'a';
        while (i<='z'){
            System.out.println(i);
            i++;
        }
    }
}
