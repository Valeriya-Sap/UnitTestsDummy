import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestngEvenOddCheckerTests {

    @Test
    public void testNumEven() {
        assertEquals(EvenOddChecker.check(518), true);
    }

    @Test
    public void testNumOdd() {
        assertEquals(EvenOddChecker.check(1111), false);
    }
}
