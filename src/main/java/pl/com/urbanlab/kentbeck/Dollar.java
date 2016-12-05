package pl.com.urbanlab.kentbeck;

/**
 * Created by andrzej on 05.12.16.
 */
public class Dollar {

    public int amount;

    public Dollar(int amount) {
        this.amount = amount;
    }

    public void times(int multiplier) {
        this.amount *= multiplier;
    }
}
