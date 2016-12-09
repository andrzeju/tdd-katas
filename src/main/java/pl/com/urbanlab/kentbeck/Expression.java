package pl.com.urbanlab.kentbeck;

/**
 * Created by andrzej on 06.12.16.
 */
public interface Expression {
    public Money reduce(Bank bank, String currency);
}
