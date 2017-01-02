package pl.com.urbanlab.discounts;

/**
 * Created by andrzej on 02.01.17.
 */
public class TwoBooksDiscount implements Discount {

    public double getDiscount(int amount) {
        return amount == 2 ? 0.1 : 0;
    }
}
