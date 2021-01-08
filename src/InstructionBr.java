class InstructionBr {
    public static void main(String[] args) throws java.io.IOException{
        int num;

        num = 100;
        for (int i = 0; i<num; i++){
            if (i*i >= num){
                break;
            }
            System.out.println(i+ " " + i*i);
        }
        System.out.println("Loop exit.");

        char mCh, ignore;
        for ( ; ; ){
            mCh = (char)System.in.read();
            do {
                ignore = (char) System.in.read();
            }while (ignore!='\n');
            if (mCh=='Q'){
                break;
            }else {
                System.out.println("Not now! Repeat!");
            }
        }
        System.out.println("You pressed Q!");

    }
}
