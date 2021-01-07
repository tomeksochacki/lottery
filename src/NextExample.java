import java.io.IOException;

class NextExample {
    public static void main(String[] args) throws IOException {
        double sum = 0;
        for (int i = 0; i <= 5; sum = sum + i++) {

        }
        System.out.println(sum);

        double sum2 = 0;
        double fact2 = 1;
        for (int j = 1; j <= 5; j++) {
            sum2 = sum2 + j;
            System.out.println(sum2);
            fact2 = fact2 * j;
            System.out.println(fact2);
        }

        String[] myTab = {"a", "b", "c", "c"};
        for (String mE: myTab ) {
            System.out.println(mE);
        }

        int b = 4;
        while (b<=9){
            System.out.println(b);
            b++;
        }

        char myChar = 'a';
        while (myChar<='z'){
            System.out.println(myChar);
            myChar++;
        }

        //double pot = 0;
        //double variable = 0;
        //while (variable < 10){
        //    pot = variable;
        //}

        char ch;
        do {
            ch = (char) System.in.read();
        } while (ch != 'q');


        int myInt = 3;
        while (myInt <= 6 ){
            System.out.println(myInt);
            myInt++;
        }

        int myInt2 = 2;
        do {
            System.out.println("______");
            System.out.println(myInt2);
            myInt2++;
        } while (myInt2 < 10);

    }
}
