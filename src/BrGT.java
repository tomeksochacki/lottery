class BrGT {
    public static void main(String[] args) {
        int i;

        for (i = 1; i < 4; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni is equal " + i);
                        if (i==1) break one;
                        if (i==2) break two;
                        if (i==3) break three;
                    }
                    System.out.println("Behind the block three.");
                }
                System.out.println("Behind the block two.");
            }
            System.out.println("Behind the block one.");
        }
        System.out.println("Behind the loop for.");
    }
}
