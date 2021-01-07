import java.io.IOException;

class ExampleMy {
    public static void main(String[] args) throws IOException {
/*        int myNumber = 4;
        do {
            System.out.println("My number is: " + myNumber);
            myNumber++;
        } while (myNumber <= 9);

        do {
            System.out.println("Enter the word, and click Enter");
            char myWord;
            myWord= (char)System.in.read();
        } while (myNumber!='T');*/

        char myChar, ignore, answer = 'K';

        do {
            System.out.println("Enter the letter:");
            myChar = (char) System.in.read();
            /*do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');*/


            if (myChar == answer) {
                System.out.println("Good, you won!!");
            } else if (myChar > answer) {
                System.out.println("Too high!!");
            } else if (myChar < answer) {
                System.out.println("Too low!!");
            }

        } while (myChar != answer);

    }
}
