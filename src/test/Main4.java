package test;
class My{
    public static void main(String[] args) {
        Main4 main4 = new Main4();
        System.out.println(main4.pattern(5));

    }
}

class Main4 {
    public static String pattern(int n) {
        String res = null;
        for (int i = n; i > 0; i--) {
            int tmp = n;
            for (int j = i; j < 0; j++) {
                res += tmp--;
            }
            res += "\n";
        }
        return res;
    }
}
