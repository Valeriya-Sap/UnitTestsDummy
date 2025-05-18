import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestngCalculatorTests {

    private Calculator calculator;

    @BeforeMethod
    public void precondition() {
        calculator = new Calculator();
    }

    @Test
    public void testCalculatorAdd() {

        assertEquals(calculator.add(6, 7), 13);
    }

    @Test
    public void testCalculatorSubtract() {
        assertEquals(calculator.subtract(16, 7), 9);
    }

    @Test
    public void testCalculatorMultiply() {
        assertEquals(calculator.multiply(10, 7), 70);
    }

    @Test
    public void testCalculatorDivide() {
        assertEquals(calculator.divide(35, 7), 5);
    }
}
