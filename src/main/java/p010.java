/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * <p>
 * Find the sum of all the primes below two million.
 */
public class p010 {
    public static final int LIMIT = 2000000;

    public static long main(String[] args) {
        long sum = 0;
        for (int i = 0; i < LIMIT; i++) {
            if(resources.isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
