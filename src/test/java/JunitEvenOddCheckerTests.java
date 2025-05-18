import org.junit.Test;

import static org.junit.Assert.*;

public class JunitEvenOddCheckerTests {

    @Test
    public void testNumEven() {
        assertEquals(true, EvenOddChecker.check(236));
    }

    @Test
    public void testNumOdd() {
        assertEquals(false, EvenOddChecker.check(235));
    }
}
