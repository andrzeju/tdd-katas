package pl.com.urbanlab.kentbeck;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 05.12.16.
 */
public class MoneyTest {

    @Test
    public void testMultiplication() {
        Money fiveDollar = Money.dollar(5);
        Expression tenDollar = fiveDollar.times(2);
        assertEquals(Money.dollar(10), tenDollar);
        Expression fifteenDollar = fiveDollar.times(3);
        assertEquals(Money.dollar(15), fifteenDollar);
    }

    @Test
    public void testEquality() {
        Money fiveFranc = Money.franc(5);
        Money fiveDollar = Money.dollar(5);
        assertEquals(Money.franc(5), fiveFranc);
        assertNotEquals(fiveDollar, fiveFranc);
        assertEquals(Money.dollar(5), fiveDollar);
        assertEquals(Money.franc(5), fiveFranc);
    }

    @Test
    public void testSum() {
        Money fiveDollar = Money.dollar(5);
        Money tenDollar = Money.dollar(10);
        Money sevenDollar = Money.dollar(7);
        Sum sum = (Sum) fiveDollar.plus(tenDollar);
        assertEquals(fiveDollar, sum.addend);
        assertEquals(tenDollar, sum.augent);
        assertNotEquals(Money.dollar(10), fiveDollar.plus(sevenDollar));
    }

    @Test
    public void testSimpleAddition() {
        Bank bank = new Bank();
        Expression sum = new Sum(Money.dollar(5), Money.dollar(5));
        Money reduced = bank.reduce(sum, "USD");
        assertEquals(Money.dollar(10), reduced);
    }
}