package pl.com.urbanlab.kentbeck;

/**
 * Created by andrzej on 06.12.16.
 */
public class Sum implements Expression {

    Money augent;
    Money addend;

    public Sum(Money money, Money added) {
        this.addend = money;
        this.augent = added;
    }
}
