/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * <p>
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.
 * <p>
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 */
public class p009 {
    public static final int TOTAL = 1000;

    public static int main(String[] args) {
        int a, b, c;

        for (a = 1; a < TOTAL; a++) {
            for (b = a + 1; b < TOTAL; b++) {
                if (((c = (TOTAL - a - b)) > 0)
                        && (a + b + c == TOTAL)
                        && (Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2))) {
                    System.out.println("a: " + a + "\nb: " + b + "\nc: " + c + "\n");
                    return a * b * c;
                }
            }
        }
        return -1;
    }
}
