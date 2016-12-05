package pl.com.urbanlab.kentbeck;

/**
 * Created by andrzej on 05.12.16.
 */
public class Money {

    private int amount;
    private String currency;

    private Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    public Money times(int multiplier) {
        return dollar(this.amount * multiplier);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Money money = (Money) o;

        return amount == money.amount;

    }

    @Override
    public int hashCode() {
        return amount;
    }

    public static Money franc(int amount) {
        return new Money(amount, "CHF");
    }
}
