/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * <p>
 * Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class p004 {
    public static int main(String[] args) {
        int num = 0;

        for (int i = 100; i < 1000; i++) {
            for(int j = 100; j < 1000; j++) {
                int aux = i * j;
                if((resources.isPalindrome(aux)) && (aux > num)) {
                    num = aux;
                }
            }
        }
        return num;
    }
}
