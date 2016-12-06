package pl.com.urbanlab.kentbeck;

/**
 * Created by andrzej on 06.12.16.
 */
public class Bank {

    public Money reduce(Expression exp, String currency) {
        Sum sum = (Sum) exp;
        return sum.reduce(currency);
    }
}
