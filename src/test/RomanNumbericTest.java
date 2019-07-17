import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumbericTest {
    Count count;

    @Before
    public void setUp() {
        count = new Count();
    }

    @Test
    public void itShouldIWhenInputIS1 () {
        String actual = count.romanNumberic(1);
        assertEquals("I", actual);
    }

    @Test
    public void itShouldIIWhenInputIS2 () {
        String actual = count.romanNumberic(2);
        assertEquals("II", actual);
    }

    @Test
    public void itShouldIIIWhenInputIS3 () {
        String actual = count.romanNumberic(3);
        assertEquals("III", actual);
    }

    @Test
    public void itShouldIVWhenInputIS4 () {
        String actual = count.romanNumberic(4);
        assertEquals("IV", actual);
    }

    @Test
    public void itShouldVWhenInputIS5 () {
        String actual = count.romanNumberic(5);
        assertEquals("V", actual);
    }

    @Test
    public void itShouldVIWhenInputIS6 () {
        String actual = count.romanNumberic(6);
        assertEquals("VI", actual);
    }

    @Test
    public void itShouldVIIWhenInputIS7 () {
        String actual = count.romanNumberic(7);
        assertEquals("VII", actual);
    }

    @Test
    public void itShouldVIIIWhenInputIS8 () {
        String actual = count.romanNumberic(8);
        assertEquals("VIII", actual);
    }

    @Test
    public void itShouldIXWhenInputIS9 () {
        String actual = count.romanNumberic(9);
        assertEquals("IX", actual);
    }
}
