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
        Money tenDollar = fiveDollar.times(2);
        assertEquals(Money.dollar(10), tenDollar);
        Money fifteenDollar = fiveDollar.times(3);
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
        assertEquals(Money.dollar(15), fiveDollar.plus(tenDollar));
        assertNotEquals(Money.dollar(10), fiveDollar.plus(sevenDollar));
    }
}