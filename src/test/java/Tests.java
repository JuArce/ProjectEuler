import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    void p0001Test() {
        Assertions.assertEquals(233168, p001.main(null));
    }

    @Test
    void p0002Test() {
        Assertions.assertEquals(4613732, p002.main(null));
    }

    @Test
    void p0003Test() {
        Assertions.assertEquals(6857, p003.main(null));
    }

    @Test
    void p0004Test() {
        Assertions.assertEquals(906609, p004.main(null));
    }

    @Test
    void p0005Test() {
        Assertions.assertEquals(232792560, p005.main(null));
    }


}
