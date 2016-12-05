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
}
