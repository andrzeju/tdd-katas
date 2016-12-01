package pl.com.urbanlab.fizzbuzz;

/**
 * Created by andrzej on 01.12.16.
 */
public class FizzBuzzGenerator {

    public String getFizzBuzz(int number) {
        String result = "";
        if (number % 3 == 0) {
            result += "fizz";
        }
        if (number % 5 == 0) {
            result += "buzz";
        }
        return result.isEmpty() ? String.valueOf(number) : result;
    }
}
