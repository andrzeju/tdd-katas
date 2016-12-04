package pl.com.urbanlab.hours;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 02.12.16.
 */
public class HumanReadableParserTest {

    @Test
    public void secondsOnly() {
        assertEquals(new ParsedTime(0,0,23), (new HumanReadableParser().parse("23s")));
        assertEquals(new ParsedTime(0,0,59), (new HumanReadableParser().parse("59s")));
    }

    @Test
    public void minutesAndSeconds() {
        assertEquals(new ParsedTime(0,12,22), new HumanReadableParser().parse("12m22s"));
        assertEquals(new ParsedTime(0,12,22), new HumanReadableParser().parse("12m 22s"));
        assertEquals(new ParsedTime(0,12,22), new HumanReadableParser().parse("12m:22s"));
    }

    @Test
    public void minutesSecondsAndHours() {
        assertEquals(new ParsedTime(1,12,22), new HumanReadableParser().parse("1h:12m:22s"));
        assertEquals(new ParsedTime(12,12,22), new HumanReadableParser().parse("12h 12m 22s"));
        assertEquals(new ParsedTime(23,59,59), new HumanReadableParser().parse("23h59m59s"));
    }

    @Test
    public void zero() {
        assertEquals(new ParsedTime(0,0,0), new HumanReadableParser().parse("0h0m0s"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void invalidValues() {
        new HumanReadableParser().parse("zzzzz");
    }

}