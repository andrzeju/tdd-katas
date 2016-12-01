package pl.com.urbanlab.hours;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 01.12.16.
 */
public class HumanReadableSecondsTest {

    @Test
    public void onlySeconds() {
        assertEquals("3s", new HumanReadableSeconds().convertSeconds(3));
        assertEquals("53s", new HumanReadableSeconds().convertSeconds(53));
        assertEquals("26s", new HumanReadableSeconds().convertSeconds(26));
    }

    @Test
    public void secondsAndMinutes() {
        assertEquals("1m:53s", new HumanReadableSeconds().convertSeconds(113));
        assertEquals("34m:26s", new HumanReadableSeconds().convertSeconds(2066));
    }

    @Test
    public void hoursSecondsAndMinutes() {
        assertEquals("1h:1m:17s", new HumanReadableSeconds().convertSeconds(3677));
        assertEquals("23h:34m:44s", new HumanReadableSeconds().convertSeconds(84884));
        assertEquals("23h:59m:59s", new HumanReadableSeconds().convertSeconds(86399));
        assertEquals("24h:0m:0s", new HumanReadableSeconds().convertSeconds(86400));
    }
}