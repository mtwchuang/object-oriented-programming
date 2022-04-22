package Week_09;

import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CounterTest 
{
    Counter counter1 = null;
    @Before
    public void setup()
    {
        counter1 = new Counter();
    }
    @Test
    public void testIncrement()
    {
        assertTrue(counter1.increment()==1);
        assertTrue(counter1.increment()==2);
    }
    @Test
    public void testDecrement()
    {
        assertTrue(counter1.decrement()==-1);
        assertTrue(counter1.decrement()==-2);
    }
    @After    
    public void clean()
    {
        if(counter1!=null)
        {
            counter1=null;
        }
    }
}
