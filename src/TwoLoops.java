class TwoLoops {
    public static void main(String[] args) {

        //done:
        for (int i = 0; i < 3; i++) {


            System.out.println("Counter outer loop: " + i);
            System.out.println("Counter inner loop: ");

            int t = 0;
            while (t < 100) {
                if (t == 10) {
                    break; //done;
                }
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }

        System.out.println("Loops exit");
    }
}
