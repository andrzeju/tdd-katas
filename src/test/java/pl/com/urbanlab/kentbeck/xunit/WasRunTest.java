package pl.com.urbanlab.kentbeck.xunit;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 10.12.16.
 */
public class WasRunTest {

    @Test
    public void testWasRun() {
        WasRun test = new WasRun();
        assertFalse(test.wasRun);
        test.testMethod();
        assertTrue(test.wasRun);
    }
}