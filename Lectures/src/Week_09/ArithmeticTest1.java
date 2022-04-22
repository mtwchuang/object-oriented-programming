package Week_09;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ArithmeticTest1 
{
    @BeforeClass
    public static void setupBeforeClass() throws Exception
    {
        System.out.println("Before class setup");
    }
    @AfterClass
    public static void cleanupAfterClass() throws Exception
    {
        System.out.println("After class setup");
    }
    @Before
    public void setup()
    {
        System.out.println("Setup");
    }
    @After
    public void cleanup()
    {
        System.out.println("Cleanup");
    }
    @Test
    public final void testMultiply()
    {
        System.out.println("Test multiply");
    }
    @Test
    public final void testDiving()
    {
        System.out.println("Test diving");
    }
}
