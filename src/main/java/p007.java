/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10 001st prime number?
 */
public class p007 {
    public static int main(String[] args) {
        int i = 1;
        int num = 1;
        while(i <= 10001) {
            if(resources.isPrime(++num)) {
                i++;
            }
        }
        return num;
    }
}
