package pl.com.urbanlab.kentbeck;

/**
 * Created by andrzej on 05.12.16.
 */
public class Dollar {

    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
        return new Dollar(this.amount * multiplier);
    }

    @Override
    public String toString() {
        return "Dollar{" +
                "amount=" + amount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dollar dollar = (Dollar) o;

        return amount == dollar.amount;

    }

    @Override
    public int hashCode() {
        return amount;
    }
}
