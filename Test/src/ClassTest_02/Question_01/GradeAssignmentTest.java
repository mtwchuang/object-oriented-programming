package ClassTest_02.Question_01;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class GradeAssignmentTest 
{
    static GradeAssignment ga;
    @BeforeClass
    public static void setUp()
    {
        ga = new GradeAssignment();
    }

    @Test
    public void testValidInput()
    {
        assertTrue(ga.getGrade("89")=='A');
        assertEquals(ga.getGrade("49"),'C');
        assertFalse(ga.getGrade("5")!='D');
    }
    @Test (expected=IndexOutOfBoundsException.class)
    public void testOutOfLowerBound()
    {
        ga.getGrade("-5");
    }
    @Test (expected=IndexOutOfBoundsException.class)
    public void testOutOfUpperBound()
    {
        ga.getGrade("150");
    }
    @Test (expected = NumberFormatException.class)
    public void testInvalidInput()
    {
        ga.getGrade("ASDKISAD");
    }
    @AfterClass
    public static void cleanUp()
    {
        if(ga!=null)
        {
            ga=null;
        }
    }
}
