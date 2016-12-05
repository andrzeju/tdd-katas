package pl.com.urbanlab.kentbeck;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 05.12.16.
 */
public class MoneyTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        Money ten = five.times(2);
        assertEquals(Money.dollar(10), ten);
        Money fifteen = five.times(3);
        assertEquals(Money.dollar(15), fifteen);
        Money fiveFranc = Money.franc(5);
        assertEquals(Money.franc(5), fiveFranc);
        assertNotEquals(five, fiveFranc);
    }

    @Test
    public void testEquality() {
        assertEquals(Money.dollar(5), Money.dollar(5));
    }
}