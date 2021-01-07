import java.io.IOException;

class NekstTwo {
    public static void main(String[] args) throws IOException {
       /* char ch;
        do {
            System.out.println("Enter character: ");
            ch = (char) System.in.read();
            System.out.println(ch);
        } while (ch != 'K');*/

        double pot;
        double score;

        for (int i = 0; i<10; i++){
            pot = 1;
            score = i;
            while (score>0){
                pot = pot*2;
                score--;
            }
            System.out.println(2 + "do potęgi" + i + "rónwns sie: " + pot);
        }


    }
}
