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

    @Test
    public void testFour() {
        String result = dsp.lcdify(4);
        assertEquals(four(), result);
    }

    @Test
    public void testFive() {
        String result = dsp.lcdify(5);
        assertEquals(five(), result);
    }

    @Test
    public void testSix() {
        String result = dsp.lcdify(6);
        assertEquals(six(), result);
    }

    @Test
    public void testSeven() {
        String result = dsp.lcdify(7);
        assertEquals(seven(), result);
    }

    @Test
    public void testEight() {
        String result = dsp.lcdify(8);
        assertEquals(eight(), result);
    }

    @Test
    public void testNine() {
        String result = dsp.lcdify(9);
        assertEquals(nine(), result);
    }

    @Test
    public void testDoubleNumber() {
        String result = dsp.lcdify(23);
        System.out.print(twentyThree());
        assertEquals(twentyThree(), result);
    }

    private String twentyThree() {
        return ".-. ._.\n._| ._|\n|_. ._|";
    }


    private String four() {
        return "...\n|_|\n..|";
    }


    private String five() {
        return "._.\n|_.\n._|";
    }


    private String six() {
        return "._.\n|_.\n|_|";
    }


    private String seven() {
        return "._.\n..|\n..|";
    }

    private String eight() {
        return "._.\n|_|\n|_|";
    }

    private String nine() {
        return "._.\n|_|\n|_.";
    }

    private String three() {
        return "._.\n._|\n._|";
    }

    private String two() {
        return ".-.\n._|\n|_.";
    }

    private String one() {
        return "...\n.|.\n.|.";
    }

    private String zero() {
        return "._.\n|.|\n._.";
    }
}