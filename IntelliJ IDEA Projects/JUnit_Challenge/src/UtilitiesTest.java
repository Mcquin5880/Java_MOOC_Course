import org.junit.Assert;

import static org.junit.Assert.*;

public class UtilitiesTest {

    private Utilities util;

    @org.junit.Before
    public void setup() {
        util = new Utilities();
    }

    @org.junit.Test
    public void everyNthChar() {
        char[] array = {'h', 'e', 'l', 'l', 'o'};
        int n = 2;
        char[] expectedOutput = {'e', 'l'};
        assertArrayEquals(expectedOutput, util.everyNthChar(array, n));
    }

    @org.junit.Test
    public void everyNthChar_nLargerThanSourceArray() {
        char[] array = {'h', 'e', 'l', 'l', 'o'};
        int n = 10;
        char[] expectedOutput = {'h', 'e', 'l', 'l', 'o'};
        assertArrayEquals(expectedOutput, util.everyNthChar(array, n));
    }

    @org.junit.Test
    public void removePairs() {
        assertEquals("ABCDEF", util.removePairs("AABCDDEFF"));
        assertEquals("ABCABDEF", util.removePairs("ABCCABDEEF"));
    }

    @org.junit.Test
    public void converter() {
        assertEquals(300, util.converter(10, 5));
    }

    @org.junit.Test(expected=ArithmeticException.class)
    public void converter_arithmeticException() {
        util.converter(10, 0);
    }

    @org.junit.Test
    public void nullIfOddLength() {
        assertNull(util.nullIfOddLength("odd"));
        assertNotNull(util.nullIfOddLength("even"));
    }
}