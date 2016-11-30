package pl.com.urbanlab.primes;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 22.11.16.
 */
public class PrimeFactorsTest {

    List<Integer> list(Integer... n) {
        return Arrays.asList(n);
    }

    @Test
    public void testOneNumber() throws Exception {
        List<Integer> primes = new PrimeFactors().generate(1);
        assertEquals(list(), primes);
    }

    @Test
    public void testTwo() throws Exception {
        List<Integer> primes = new PrimeFactors().generate(2);
        assertEquals(list(2), primes);
    }

    @Test
    public void testThree() throws Exception {
        List<Integer> primes = new PrimeFactors().generate(3);
        assertEquals(list(3), primes);
    }

    @Test
    public void testFour() throws Exception {
        List<Integer> primes = new PrimeFactors().generate(4);
        assertEquals(list(2,2), primes);
    }

    @Test
    public void testFive() throws Exception {
        List<Integer> primes = new PrimeFactors().generate(5);
        assertEquals(list(5), primes);
    }

    @Test
    public void testSix() throws Exception {
        List<Integer> primes = new PrimeFactors().generate(6);
        assertEquals(list(2,3), primes);
    }

    @Test
    public void testSeven() throws Exception {
        List<Integer> primes = new PrimeFactors().generate(7);
        assertEquals(list(7), primes);
    }

    @Test
    public void testEight() throws Exception {
        List<Integer> primes = new PrimeFactors().generate(8);
        assertEquals(list(2,2,2), primes);
    }

    @Test
    public void testNine() throws Exception {
        List<Integer> primes = new PrimeFactors().generate(9);
        assertEquals(list(3,3), primes);
    }


    @Test
    public void testTen() throws Exception {
        List<Integer> primes = new PrimeFactors().generate(10);
        assertEquals(list(2,5), primes);
    }

}