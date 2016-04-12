import java.io.*;

class Problem5 {
    public static void main(String[] args) {

        int num = 20;
        int guess = num;

        while(true) {
            boolean divisibleByAll = true;

            for(int i=2; i<num; i++) {
                if(guess%i != 0) {
                    divisibleByAll = false;
                    break;
                }
            }

            if(divisibleByAll)
                break;
            else
                guess+=num;
       }

       System.out.println(guess);
    }
}
