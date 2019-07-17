import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanNumbericTest {

    @Test
    public void itShouldIWhenInputIS1 () {
        Count count = new Count();
        String actual = count.romanNumberic(1);
        assertEquals("I", actual);
    }

    @Test
    public void itShouldIIWhenInputIS2 () {
        Count count = new Count();
        String actual = count.romanNumberic(2);
        assertEquals("II", actual);
    }
}
