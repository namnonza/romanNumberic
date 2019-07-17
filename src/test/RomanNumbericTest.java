import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

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

    @Test
    public void itShouldXWhenInputIS10 () {
        String actual = count.romanNumberic(10);
        assertEquals("X", actual);
    }

    @Test
    public void itShouldXIWhenInputIS11 () {
        String actual = count.romanNumberic(11);
        assertEquals("XI", actual);
    }

    @Test
    public void itShouldXIIIWhenInputIS13 () {
        String actual = count.romanNumberic(13);
        assertEquals("XIII", actual);
    }

//    @Test
//    public void itShouldTRUEWhenIIIIcontainedWhenInputIS14() {
//        boolean actual = count.romanNumberic(14).contains("IIII");
//        assertTrue(actual);
//    }

    @Test
    public void itShouldXIVWhenInputIS14 () {
        String actual = count.romanNumberic(14);
        assertEquals("XIV", actual);
    }

    @Test
    public void itShouldXVWhenInputIS15 () {
        String actual = count.romanNumberic(15);
        assertEquals("XV", actual);
    }

    @Test
    public void itShouldXVIIIWhenInputIS18 () {
        String actual = count.romanNumberic(18);
        assertEquals("XVIII", actual);
    }

    @Test
    public void itShouldXIXWhenInputIS19 () {
        String actual = count.romanNumberic(19);
        assertEquals("XIX", actual);
    }

    @Test
    public void itShouldXXWhenInputIS20 () {
        String actual = count.romanNumberic(20);
        assertEquals("XX", actual);
    }

    @Test
    public void itShouldXXIIIWhenInputIS23 () {
        String actual = count.romanNumberic(23);
        assertEquals("XXIII", actual);
    }

    @Test
    public void itShouldXXIVWhenInputIS24 () {
        String actual = count.romanNumberic(24);
        assertEquals("XXIV", actual);
    }

    @Test
    public void itShouldXXVWhenInputIS25 () {
        String actual = count.romanNumberic(25);
        assertEquals("XXV", actual);
    }

    @Test
    public void itShouldXXVIIWhenInputIS27 () {
        String actual = count.romanNumberic(27);
        assertEquals("XXVII", actual);
    }

    @Test
    public void itShouldXXIXWhenInputIS29 () {
        String actual = count.romanNumberic(29);
        assertEquals("XXIX", actual);
    }

    @Test
    public void itShouldXXXWhenInputIS30 () {
        String actual = count.romanNumberic(30);
        assertEquals("XXX", actual);
    }

    @Test
    public void itShouldXLWhenInputIS40 () {
        String actual = count.romanNumberic(40);
        assertEquals("XL", actual);
    }

    @Test
    public void itShouldLWhenInputIS50 () {
        String actual = count.romanNumberic(50);
        assertEquals("L", actual);
    }

    @Test
    public void itShouldLXIXWhenInputIS69 () {
        String actual = count.romanNumberic(69);
        assertEquals("LXIX", actual);
    }

    @Test
    public void itShouldLXXXIVWhenInputIS84 () {
        String actual = count.romanNumberic(84);
        assertEquals("LXXXIV", actual);
    }

    @Test
    public void itShouldXCIXWhenInputIS99 () {
        String actual = count.romanNumberic(99);
        assertEquals("XCIX", actual);
    }

    @Test
    public void itShouldCCCXCIVWhenInputIS394 () {
        String actual = count.romanNumberic(394);
        assertEquals("CCCXCIV", actual);
    }
}
