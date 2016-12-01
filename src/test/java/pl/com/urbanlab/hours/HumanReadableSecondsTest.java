package pl.com.urbanlab.hours;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 01.12.16.
 */
public class HumanReadableSecondsTest {

    @Test
    public void onlySeconds() {
        assertEquals("53s", new HumanReadableSeconds().convertSeconds(53));
        assertEquals("26s", new HumanReadableSeconds().convertSeconds(26));
    }
    @Test
    public void secondsAndMinutes() {
        assertEquals("1m:53s", new HumanReadableSeconds().convertSeconds(113));
        assertEquals("34m:26s", new HumanReadableSeconds().convertSeconds(2066));
    }
}