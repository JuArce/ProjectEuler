public class resources {
    public static boolean isPrime(long num) {
        for(int divider = 2; divider < (long)Math.sqrt(num); divider++) {
            if(num % divider == 0) {
                return false;
            }
        }
        return true;
    }
}
