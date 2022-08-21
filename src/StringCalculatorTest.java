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
}
