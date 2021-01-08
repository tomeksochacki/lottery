package test;

class BrEx {
    public static void main(String[] args) {

        one: for (int i = 0; i < 5; i++){
            System.out.println("Tekst + counter loop i: " + i);
        }
        for (int j = 0; j<100; j++){
            if (j == 10) break;
            System.out.println(j);
        }
    }
}
