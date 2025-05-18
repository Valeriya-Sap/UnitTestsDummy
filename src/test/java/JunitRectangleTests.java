import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class JunitRectangleTests {

    private Rectangle rectangle;

    @Before
    public void precondition() {
        rectangle = new Rectangle(17, 15.5);
    }

    @Test
    public void testGetLength() {
        assertEquals(17, rectangle.getLength(), 0.0001);
    }

    @Test
    public void testSetLength() {
        rectangle.setLength(5.5);
        assertEquals(5.5, rectangle.getLength(), 0.0001);
    }

    @Test
    public void testGetWidth() {
        assertEquals(15.5, rectangle.getWidth(), 0.0001);
    }

    @Test
    public void testSetWidth() {
        rectangle.setWidth(5.5);
        assertEquals(5.5, rectangle.getWidth(), 0.0001);
    }

    @Test
    public void testGetArea() {
        assertEquals(263.5, rectangle.getArea(), 0.0001);

    }
}
