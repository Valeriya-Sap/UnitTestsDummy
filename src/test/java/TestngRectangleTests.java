import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestngRectangleTests {

    private Rectangle rectangle;

    @BeforeMethod
    public void precondition() {
        rectangle = new Rectangle(100, 0.1);
    }

    @Test
    public void testGetLength() {
        assertEquals(rectangle.getLength(), 100);
    }

    @Test
    public void testSetLength() {
        rectangle.setLength(5);
        assertEquals(rectangle.getLength(), 5);
    }

    @Test
    public void testGetWidth() {
        assertEquals(rectangle.getWidth(), 0.1);
    }

    @Test
    public void testSetWidth() {
        rectangle.setWidth(101);
        assertEquals(rectangle.getWidth(), 101);
    }

    @Test
    public void testGetArea() {
        assertEquals(rectangle.getArea(), 10);
    }
}
