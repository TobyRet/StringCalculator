/**
 * Created by tobyretallick on 08/08/2014.
 */
public class StringCalculator {
    public static int add(final String numbers) {
        int returnValue = 0;
        String[] numbersArray = numbers.split(",");
        if (numbersArray.length > 2) {
            throw new RuntimeException("Up to 2 numbers separated by comma (,), are allowed");
        } else {
            for(String number : numbersArray) {
                if(!number.trim().isEmpty()) {
                    returnValue += Integer.parseInt(number); // If it is not a number, parseInt will throw and exception
                }
            }
        }
        return returnValue;
    }
}
