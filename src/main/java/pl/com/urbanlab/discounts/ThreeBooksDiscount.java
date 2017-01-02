package pl.com.urbanlab.discounts;

/**
 * Created by andrzej on 02.01.17.
 */
public class ThreeBooksDiscount implements Discount {
    public double getDiscount(int amount) {
        return amount == 3 ? 0.2 : 0;
    }
}
