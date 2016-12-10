package pl.com.urbanlab.kentbeck.financial;

import java.util.Hashtable;

/**
 * Created by andrzej on 06.12.16.
 */
public class Bank {

    private Hashtable<Pair, Integer> rates = new Hashtable<Pair, Integer>();

    public Money reduce(Expression exp, String currency) {
        return exp.reduce(this, currency);
    }

    public void addRate(String from, String to, int rate) {
        rates.put(new Pair(from, to), rate);
    }

    public int rate(String currencyFrom, String currencyTo) {
        return rates.getOrDefault(new Pair(currencyFrom, currencyTo), 1);
    }
}
