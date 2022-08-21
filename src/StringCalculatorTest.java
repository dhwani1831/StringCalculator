import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringCalculatorTest 
{
    private StringCalculator calculator;

    @Before
    public void init()
    {
        calculator = new StringCalculator();
    };

    @Test
    public void emptyStringReturnZero()
    {
       assertEquals(calculator.add(""), 0);
    }
    
    @Test
    public void singleStringReturnValue()
    {
        assertEquals(calculator.add("1"), 1);
    }

    @Test
    public void addTwoNumbers()
    {
        assertEquals(calculator.add("1,2"), 3);
    }

    @Test
    public void allowUnknownAmountOfNumber()
    {
        assertEquals(calculator.add("1,2,3"), 6);
    }

    @Test
    public void allowAlphabetsWithNumbers()
    {
        assertEquals(calculator.add("1,2,a"), 4);
    }

    @Test(expected = Exception.class)
    public void negativeNotAllowed() throws Exception
    {
        calculator.add("-1");
    }

}
