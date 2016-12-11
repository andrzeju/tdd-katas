package pl.com.urbanlab.kentbeck.xunit;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 10.12.16.
 */
public class TestCaseTest {

    @Test
    public void testWasRun() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        WasRun test = new WasRun("testMethod");
        assertFalse(test.wasRun);
        test.run();
        assertTrue(test.wasRun);
    }

    @Test
    public void testSetUp() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        WasRun test = new WasRun("testMethod");
        test.run();
        assertTrue(test.wasSetUp);
    }
}