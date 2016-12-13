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

    public double log;
    private WasRun test;

    @Test
    public void testTemplateMethod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        WasRun test = new WasRun("testMethod");
        assertEquals("", test.log);
        test.run();
        assertEquals("setUp testMethod tearDown", test.log);
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}