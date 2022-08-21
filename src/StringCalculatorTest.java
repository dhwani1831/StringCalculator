import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class StringCalculatorTest 
{
    @Test
    public void emptyStringReturnZero()
    {
        StringCalculator calculator = new StringCalculator();
        assertEquals(calculator.add(""), 0);
    }
    @Test
    public void singleStringReturnValue()
    {
        StringCalculator calculator = new StringCalculator();
        assertEquals(calculator.add("1"), 1);
    }
}
