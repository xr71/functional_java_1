import java.util.HashSet;
import java.util.Set;

// Write an algorithm to determine if a number is "happy".

// A happy number is a number defined by the following process:
// Starting with any positive integer, replace the number by the
// sum of the squares of its digits, and repeat the process until
// the number equals 1 (where it will stay), or it loops endlessly
// in a cycle which does not include 1. Those numbers for which
// this process ends in 1 are happy numbers.

public class HappyNumber {

    public static void main(final String[] args) {

        final Set<Integer> myset = new HashSet<>();

        // myset.add(82);
        // myset.add(82);
        // myset.add(82);

        int n = 20;
        // String strn = String.valueOf(n);
        // char[] digits = strn.toCharArray();

        // System.out.println(digits);

        // calculate a sum of squre
        int sum = 0;
        int rem = 0;

        while (true) {
            while (n > 0) {
                rem = n % 10;
                sum = (int) (sum + Math.pow(rem, 2));

                // truncate a unit off of n
                n = n / 10;
            }

            if (n == 1) {
                System.out.println(myset);
                System.out.println(sum);
                System.out.println("TRUE");
                return;
            }
            if (myset.contains(sum)) {
                System.out.println(myset);
                System.out.println(sum);
                System.out.println("FALSE");
                return;
            }

            myset.add(sum);
            n = sum;
            sum = 0;

            // System.out.println(n);
            // System.out.println(myset);
            // System.out.println("=========");

        }

    }
}