import java.io.*;
import java.util.ArrayList;

class Problem3 {
    public static void main(String[] args) {
        ArrayList<Long> primeFactors = new ArrayList<Long>();
        long n = 600851475143L;

        for(long i=2; i<n; i++) {
            if(n%i == 0) {
                primeFactors.add(i);
                n /= i;
            }
        }

        if(n != 0)
            primeFactors.add(n);

        System.out.println(primeFactors.get(primeFactors.size()-1));
    }
}
