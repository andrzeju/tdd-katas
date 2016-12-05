package pl.com.urbanlab.kentbeck;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 05.12.16.
 */
public class DollarTest {

    @Test
    public void testMultiplication() {
        Dollar five = new Dollar(5);
        Dollar ten = five.times(2);
        assertEquals(new Dollar(10), ten);
        Dollar fifteen = five.times(3);
        assertEquals(new Dollar(15), fifteen);
    }

    @Test
    public void testEquality() {
        assertEquals(new Dollar(5), new Dollar(5));
    }
}