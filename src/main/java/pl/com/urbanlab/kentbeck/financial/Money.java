package pl.com.urbanlab.kentbeck.financial;

/**
 * Created by andrzej on 05.12.16.
 */
public class Money implements Expression {

    public int amount;
    private String currency;

    Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public Expression times(int multiplier) {
        return new Money(this.amount * multiplier, this.currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        if (amount != money.amount) return false;
        return currency != null ? currency.equals(money.currency) : money.currency == null;

    }

    @Override
    public int hashCode() {
        int result = amount;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    public Expression plus(Expression added) {
        return new Sum(this, added);
    }

    public Money reduce(Bank bank, String currency) {
        int rate = bank.rate(this.currency, currency);
        return Money.dollar(this.amount / rate);
    }
}
