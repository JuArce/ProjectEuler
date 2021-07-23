/**
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * <p>
 * What is the largest prime factor of the number 600851475143 ?
 */
public class p003 {
    public static long main(String[] args) {
        return getMaxPrimeFactor(600851475143L);
    }

    public static long getMaxPrimeFactor(long num) {
        while (true) {
            long p = smallestFactor(num);
            if (p < num)
                num /= p;
            else
                return num;
        }
    }

    public static long smallestFactor(long n) {
        if (n <= 1)
            throw new IllegalArgumentException();
        for (long i = 2, end = (long) Math.sqrt(n); i <= end; i++) {
            if (n % i == 0)
                return i;
        }
        return n;  // n itself is prime
    }
}
