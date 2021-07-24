import java.util.ArrayList;
import java.util.List;

public class resources {

    public static boolean isPrime(long num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number must be natural");
        }
        if (num == 0 || num == 1) {
            return false;
        }
        for (int divider = 2; divider <= (long) Math.sqrt(num); divider++) {
            if (num % divider == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int aux = num;
        int reverse = 0;
        while (num > 0) {
            reverse *= 10;
            reverse += num % 10;
            num /= 10;
        }
        return aux == reverse;
    }

    public static List<Integer> factors(int n) {
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    public static int factorsQty(int n) {
//        return factors(n).size();
        int count = 0;
        int end = (int)Math.sqrt(n);
        for (int i = 1; i < end; i++) {
            if (n % i == 0)
                count += 2;
        }
        if (end * end == n)  // Perfect square
            count++;
        return count;
    }

    public static int triangleNumber(int n) {
        if(n <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }

        int triangle = 0;
        for(int i = 1; i <= n; i++) {
            triangle += i;
        }

        return triangle;
    }
}
