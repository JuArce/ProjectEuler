import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    void p001Test() {
        Assertions.assertEquals(233168, p001.main(null));
    }

    @Test
    void p002Test() {
        Assertions.assertEquals(4613732, p002.main(null));
    }

    @Test
    void p003Test() {
        Assertions.assertEquals(6857, p003.main(null));
    }

    @Test
    void p004Test() {
        Assertions.assertEquals(906609, p004.main(null));
    }

    @Test
    void p005Test() {
        Assertions.assertEquals(232792560, p005.main(null));
    }

    @Test
    void p006Test() {
        Assertions.assertEquals(25164150, p006.main(null));
    }

    @Test
    void p007Test() {
        Assertions.assertEquals(104743, p007.main(null));
    }

    @Test
    void p008Test() {
        Assertions.assertEquals(23514624000L, p008.main(null));
    }

}
