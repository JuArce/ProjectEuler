import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ResourcesTests {

    @Test
    void isPrimeTest() {
        Assertions.assertEquals(false, resources.isPrime(1));
        Assertions.assertEquals(true, resources.isPrime(2));
        Assertions.assertEquals(true, resources.isPrime(3));
        Assertions.assertEquals(false, resources.isPrime(4));
        Assertions.assertEquals(true, resources.isPrime(5));
        Assertions.assertEquals(false, resources.isPrime(6));
    }

    @Test
    void factorsTest() {
        Assertions.assertArrayEquals(new Integer[] {1, 2, 4, 7, 14, 28}, resources.factors(28).toArray());
        Assertions.assertEquals(6, resources.factorsQty(28));
    }

    @Test
    void triangleNumberTest() {
        Assertions.assertEquals(28, resources.triangleNumber(7));
    }
}
