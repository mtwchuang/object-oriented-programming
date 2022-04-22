package Week_09;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class ArithmeticTest 
{
    @Test
    public final void testMultiply()
    {
        assertEquals(4, Arithmetic.multiply(2,2));
        assertEquals(-15, Arithmetic.multiply(3, -5));
    }
    @Test
    public final void testDivide()
    {
        assertEquals(3.0, Arithmetic.divide(12.00,4.00),0.0);
        assertEquals(3.3, Arithmetic.divide(10.0,3.0),0.034);
    }
    @Test
    public final void testIsPositive()
    {
        assertTrue(Arithmetic.isPositive(5));
        assertFalse(Arithmetic.isPositive(-5));
        assertTrue(Arithmetic.isPositive(0));
    }
    // expected exception testing
    @Test(expected = NumberFormatException.class)
    public final void testException() throws NumberFormatException
    {
        String test = "test";
        int num = Integer.parseInt(test);
    }
}