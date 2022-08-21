import javax.lang.model.util.ElementScanner6;

public class StringCalculator
{
    public int add(String numbers)
    {
        String[] num = numbers.split(",");
        if(isEmpty(numbers))
            return 0;
        if(numbers.length() == 1)
            return stringToInteger(numbers);
        else if(num.length == 2)
            return addTwoNumbers(num[0] , num[1]);
        else
            return allowUnknownAmountOfNumber(num);
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
    private int allowUnknownAmountOfNumber(String[] num)
    {
        int sum = 0;
        for (String current : num) {
            if(Character.isAlphabetic(current.charAt(0)))
            {
                int ch = current.charAt(0) - 96;
                sum += ch;
            }
            else
                sum += stringToInteger(current);
        }
        return sum;
    }
}