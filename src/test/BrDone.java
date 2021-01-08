package test;

class BrDone {
    public static void main(String[] args) {

        done:
        for (int i = 0; i<10; i++){
            for (int j = 0; j<10; j++){
                for (int k = 0; k<10; k++){
                    if (k==5) break done;
                    System.out.println(k);
                    //System.out.println("The text will never be displayed.");
                }
                System.out.println("Behind loop k.");
            }
            System.out.println("Behind loop j.");
        }
        System.out.println("Behind loop i.");
    }
}
