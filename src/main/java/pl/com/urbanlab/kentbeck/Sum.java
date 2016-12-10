package pl.com.urbanlab.kentbeck;

/**
 * Created by andrzej on 06.12.16.
 */
public class Sum implements Expression {

    Expression augent;
    Expression addend;

    public Sum(Expression money, Expression added) {
        this.augent = money;
        this.addend= added;
    }

    public Money reduce(Bank bank, String currency) {
        Integer newAmount = bank.reduce(augent, currency).amount + bank.reduce(addend, currency).amount;
        return new Money(newAmount, currency);
    }

    public Expression plus(Expression addend) {
        return new Sum(this, addend);
    }

    public Expression times(int multiplier) {
        return new Sum(augent.times(multiplier), addend.times(multiplier));
    }
}
