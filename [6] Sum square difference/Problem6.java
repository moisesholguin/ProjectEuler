import java.io.*;

class Problem6 {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
        int sumOfSquares = 0;

        for(int i=1; i<=num; i++) {
            sum += i;
            sumOfSquares += i*i;
        }

        int squareOfSums = sum*sum;

        System.out.println(squareOfSums - sumOfSquares);
    }
}

