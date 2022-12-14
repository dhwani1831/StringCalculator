import java.util.ArrayList;

public class StringCalculator
{
    private String delimeter = "/|;|!|,|\n|@|#|~|`|$|%|^|&|:|\\*";

    private String oddOrEven = "none";
    public int add(String numbers) throws Exception
    {
        String[] num = numbers.split(delimeter);
        if(isEmpty(numbers))
            return 0;
        if(numbers.length() == 1)
            return stringToInteger(numbers);
        else if(num.length == 2)
            return addTwoNumbers(num[0] , num[1]);
        else
        {
            if(numbers.startsWith("0//"))
                oddOrEven="odd";
            else if(numbers.startsWith("1//"))
                oddOrEven="even";
            return allowUnknownAmountOfNumber(num,oddOrEven);
        }            
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
    private int allowUnknownAmountOfNumber(String[] num,String oddOrEven) throws Exception
    {
        int sum = 0;
        int index=1;
        ArrayList<String> negative = new ArrayList<String>();
        for (String current : num) {
            if(current.isEmpty())
            {
                continue;
            }
            if(Character.isAlphabetic(current.charAt(0)))
            {
                int ch = current.charAt(0) - 96;
                sum += ch;
            }
            else
            {
                if(stringToInteger(current)<0)
                {
                    negative.add(current);
                }
                else if(stringToInteger(current)>1000)
                {
                    continue;
                }
                else
                {
                    if(oddOrEven=="odd" && index%2!=0)
                    {
                        sum += stringToInteger(current);                        
                    }
                    else if(oddOrEven=="even" && index%2==0)
                    {
                        sum += stringToInteger(current);
                    }
                    else if(oddOrEven=="none")
                    {
                        sum += stringToInteger(current);
                    }
                    index++;
                }                    
            }
        }
        if(negative.size()>0)
        {
            throwNegativeNumberException(negative);
        }
        return sum;
    }
    private void throwNegativeNumberException(ArrayList<String> negative) throws Exception
    {
        StringBuilder str = new StringBuilder("");
        for(String eachNegative:negative)
        {
            str.append(eachNegative).append(",");
        }
        String allNegativeNumbers = str.toString();
        allNegativeNumbers = allNegativeNumbers.substring(0, allNegativeNumbers.length() - 1);
        throw new Exception("Negative not allowed "+ allNegativeNumbers);
    }
}