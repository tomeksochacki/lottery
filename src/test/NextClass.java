package test;

class NextClass {
    public static void main(String[] args) {
        String str1 = "Tomek", str2 = "Domek", str3 = "Romek";
        System.out.println(str1 + " " + str2 + " " + str3);

        int number = 0;
        if (number < 10 ){
            System.out.println("Number is less than 10");
        } else if (number >= 10){
            System.out.println("Number is higher or equals 10");
        }

        int j = 1;
        if (j <= 10){
            System.out.println("Number j is less than 10, or equals 10");
        } else if (j > 10 && j<= 25){
            System.out.println("Number j is greater than 10, but number j is less than 25 or number j is equals 25.");
        } else if (j > 25){
            System.out.println("Number j is greater than 25");
        }

        double a = 10, b = 5;
        double divide;
        divide = a / b;
        double modulo;
        modulo = 10 % 5;
        System.out.println(divide);
        System.out.println("Modulo is: " + modulo);

        int age = 18;
        if (age >= 18){
            System.out.println("This is not child");
        } else if (age < 18){
            System.out.println("This is child");
        } else if (age > 70 ){
            System.out.println("This is elderly person");
        }
    }
}
