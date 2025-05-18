import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JunitCalculatorTests {

    private Calculator calculator;

    @Before
    public void precondition() {
        calculator = new Calculator();
    }

    @Test
    public void testCalculatorAdd() {
        assertEquals(13, calculator.add(6, 7));
    }

    @Test
    public void testCalculatorSubtract() {
        assertEquals(9, calculator.subtract(16, 7));
    }

    @Test
    public void testCalculatorMultiply() {
        assertEquals(70, calculator.multiply(10, 7));
    }

    @Test
    public void testCalculatorDivide() {
        assertEquals(5, calculator.divide(35, 7));
    }

}