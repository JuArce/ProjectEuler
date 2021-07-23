public class resources {
    public static boolean isPrime(long num) {
        for(int divider = 2; divider < (long)Math.sqrt(num); divider++) {
            if(num % divider == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(int num) {
        int aux = num;
        int reverse = 0;
        while(num > 0) {
            reverse *= 10;
            reverse += num % 10;
            num /= 10;
        }
        return aux == reverse;
    }
}
