package pl.com.urbanlab.kentbeck.xunit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 10.12.16.
 */
public class TestCaseTest extends TestCase {

    @Test
    public void testTemplateMethod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        WasRun test = new WasRun("testMethod");
        assertEquals("", test.log);
        test.run();
        assertEquals("setUp testMethod tearDown", test.log);
    }

    @Test
    public void testResult() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        WasRun test = new WasRun("testMethod");
        TestResult result = test.run();
        assertEquals("1 run, 0 failed", result.summary());
    }

    @Test
    public void testFailedResult() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        WasRun test = new WasRun("non-existing-method");
        TestResult result = test.run();
        assertEquals("1 run, 1 failed", result.summary());
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}