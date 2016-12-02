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

}