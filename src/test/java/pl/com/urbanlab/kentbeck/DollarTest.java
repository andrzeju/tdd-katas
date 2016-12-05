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
        assertEquals(10, ten.amount);
        Dollar fifteen = five.times(3);
        assertEquals(15, fifteen.amount);
    }
}