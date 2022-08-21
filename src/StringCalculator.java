public class StringCalculator
{
    public int add(String numbers)
    {
        String[] num = numbers.split(",");
        if(isEmpty(numbers))
            return 0;
        if(numbers.length() == 1)
            return stringToInteger(numbers);
        else
            return addTwoNumbers(num[0] , num[1]); 
    }

    private boolean isEmpty(String numbers)
    {
        return numbers.isEmpty();
    }
    private int stringToInteger(String numbers)
    {
        return Integer.parseInt(numbers);
    }
    private int addTwoNumbers(String num1 , String num2)
    {
        return stringToInteger(num1) + stringToInteger(num2);
    }
}