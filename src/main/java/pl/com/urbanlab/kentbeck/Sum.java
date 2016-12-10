package pl.com.urbanlab.kentbeck;

/**
 * Created by andrzej on 06.12.16.
 */
public class Sum implements Expression {

    Expression augent;
    Expression addend;

    public Sum(Expression money, Expression added) {
        this.addend = money;
        this.augent = added;
    }

    public Money reduce(Bank bank, String currency) {
        Integer newAmount = bank.reduce(augent, currency).amount + bank.reduce(addend, currency).amount;
        return new Money(newAmount, currency);
    }

    public Expression plus(Expression addend) {
        return null;
    }

    public Expression times(int multiplier) {
        return null;
    }
}
