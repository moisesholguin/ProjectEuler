import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.lang.StringBuffer;

class Problem4 {
    public static void main(String[] args) {
        // Find all products because worst case is still a solution
        int min = 100;
        int max = 999;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=min; i<=max; i++)
            for(int j=min; j<=max; j++)
                list.add(i*j);

        Collections.sort(list);

        int result = 0;
        for(int i=list.size()-1; i>=0; i--) {
            int guess = list.get(i);

            if(isPalindrome(guess)) {
                result = guess;
                break;
            }
        }

        System.out.println(result);
    }

    // Very inefficient, will improve after it works
    public static boolean isPalindrome(int n) {
        StringBuffer original = new StringBuffer(n+"");
        StringBuffer reverse = new StringBuffer(original).reverse();
        return original.toString().equals(reverse.toString());
    }
}
