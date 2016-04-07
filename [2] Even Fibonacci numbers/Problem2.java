import java.io.*;

class Problem2 {
    public static void main(String[] args) {

        final int LIMIT = 4000000;

        int evenTotal = 0;
        int firstNum = 1;
        int secondNum = 1;
        
        while(secondNum <= LIMIT) {

            if(secondNum % 2 == 0)
                evenTotal += secondNum;

            int nextNum = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNum;
        }

        System.out.println(evenTotal);
    }
}
