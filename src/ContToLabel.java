class ContToLabel {
    public static void main(String[] args) {
        outerloop :
        for (int i = 1; i<10; i++){
            System.out.println("\nThe course outer loop " + i + ", the inner loop: ");
            for (int j = 1; j<10; j++){
                if (j == 5) continue outerloop;
                System.out.print(j);
            }
        }
    }
}
