package Task1;

import org.junit.Test;
import static org.junit.Assert.*;

public class EvenOddNumberTest {

    @Test
    public void testEvenNumber() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertTrue(evenOddNumber.evenOddNumber(2));
    }

    @Test
    public void testOddNumber() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertFalse(evenOddNumber.evenOddNumber(3));
    }

    @Test
    public void testZero() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertTrue(evenOddNumber.evenOddNumber(0));
    }

    @Test
    public void testNegativeEvenNumber() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertTrue(evenOddNumber.evenOddNumber(-4));
    }

    @Test
    public void testNegativeOddNumber() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertFalse(evenOddNumber.evenOddNumber(-7));
    }

    @Test
    public void testMaxInt() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertFalse(evenOddNumber.evenOddNumber(Integer.MAX_VALUE));
    }

    @Test
    public void testMinInt() {
        EvenOddNumber evenOddNumber = new EvenOddNumber();
        assertTrue(evenOddNumber.evenOddNumber(Integer.MIN_VALUE));
    }
}
