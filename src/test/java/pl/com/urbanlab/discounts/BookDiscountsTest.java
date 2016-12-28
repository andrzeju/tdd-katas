package pl.com.urbanlab.discounts;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 28.12.16.
 */
public class BookDiscountsTest {

    Cart cart;

    @Before
    public void setUp() {
        cart = new Cart();
    }

    @Test
    public void testForSingleBook() {
        Book catch22 = new Book("Catch 22", 10);
        cart.add(catch22, 1);
        assertEquals(10, cart.price());
    }

    @Test
    public void testForTwoSameBooks() {
        Book catch22 = new Book("Catch 22", 10);
        cart.add(catch22, 2);
        assertEquals(20, cart.price());
    }

}