package pl.com.urbanlab.kentbeck;

/**
 * Created by andrzej on 06.12.16.
 */
public class Bank {

    public Money reduce(Expression exp, String currency) {
        return exp.reduce(currency);
    }

    public void addRate(String from, String to, int rate) {

    }
}
