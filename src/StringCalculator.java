public class StringCalculator
{
    public int add(String numbers)
    {
        if(isEmpty(numbers))
            return 0;
        return stringToInteger(numbers);
    }

    private boolean isEmpty(String numbers)
    {
        return numbers.isEmpty();
    }
    private int stringToInteger(String numbers)
    {
        return Integer.parseInt(numbers);
    }
}