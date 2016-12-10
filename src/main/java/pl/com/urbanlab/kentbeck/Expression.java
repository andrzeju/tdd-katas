package pl.com.urbanlab.kentbeck;

/**
 * Created by andrzej on 06.12.16.
 */
public interface Expression {

    Money reduce(Bank bank, String currency);
    Expression plus(Expression addend);
    Expression times(int multiplier);
}
