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
}
