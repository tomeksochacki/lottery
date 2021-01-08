class BrLe {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            one:
            {
                two:
                {
                    three:
                    {
                        System.out.println("\ni is equal: " + i);
                        if (i==1) break one;
                        if (i==2) break two;
                        if (i==3) break three;
                    }
                    System.out.println("Behind instruction three.");
                }
                System.out.println("Behind instruction two.");
            }
            System.out.println("Behind instruction one.");
        }
        System.out.println("Behind loop for.");
    }
}
