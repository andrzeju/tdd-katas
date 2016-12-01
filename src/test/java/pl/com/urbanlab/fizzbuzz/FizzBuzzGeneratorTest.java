package pl.com.urbanlab.fizzbuzz;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 01.12.16.
 */
public class FizzBuzzGeneratorTest {

    @Test
    public void dividedOnlyBy3() {
        assertEquals("fizz", new FizzBuzzGenerator().getFizzBuzz(3));
        assertEquals("fizz", new FizzBuzzGenerator().getFizzBuzz(6));
    }

    @Test
    public void dividedOnlyBy5() {
        assertEquals("buzz", new FizzBuzzGenerator().getFizzBuzz(5));
        assertEquals("buzz", new FizzBuzzGenerator().getFizzBuzz(10));
    }

    @Test
    public void dividedBy3and5() {
        assertEquals("fizzbuzz", new FizzBuzzGenerator().getFizzBuzz(0));
        assertEquals("fizzbuzz", new FizzBuzzGenerator().getFizzBuzz(15));
        assertEquals("fizzbuzz", new FizzBuzzGenerator().getFizzBuzz(30));
    }

    @Test
    public void noReqFilled() {
        assertEquals("1", new FizzBuzzGenerator().getFizzBuzz(1));
        assertEquals("2", new FizzBuzzGenerator().getFizzBuzz(2));
        assertEquals("4", new FizzBuzzGenerator().getFizzBuzz(4));
    }

}