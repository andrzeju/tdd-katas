package pl.com.urbanlab.lcd;

import org.junit.Before;
import org.junit.Test;
import pl.com.urbanlab.bowling.StrikeFrame;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 23.12.16.
 */
public class DisplayTest {

    Display dsp;

    @Before
    public void setUp() {
        dsp = new Display();
    }

    @Test
    public void testZero() {
        String result = dsp.lcdify(0);
        assertEquals(zero(), result);
    }

    @Test
    public void testOne() {
        String result = dsp.lcdify(1);
        assertEquals(one(), result);
    }

    @Test
    public void testTwo() {
        String result = dsp.lcdify(2);
        assertEquals(two(), result);
    }

    @Test
    public void testThree() {
        String result = dsp.lcdify(3);
        assertEquals(three(), result);
    }

    private String three() {
        return "._.\n._|\n._|";
    }

    private String two() {
        return ".-.\n._|\n._.";
    }

    private String one() {
        return "...\n.|.\n.|.";
    }

    private String zero() {
        return "._.\n|.|\n._.";
    }
}