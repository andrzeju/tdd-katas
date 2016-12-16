package pl.com.urbanlab.kentbeck.xunit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 10.12.16.
 */
public class TestCaseTestNG extends TestCase {

    private TestResult result;

    @Test
    public void testTemplateMethod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        TestCaseTest test = new TestCaseTest("testMethod");
        assertEquals("", test.log);
        test.run(result);
        assertEquals("setUp testMethod tearDown", test.log);
    }

    @Test
    public void testResult() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        TestCaseTest test = new TestCaseTest("testMethod");
        test.run(result);
        assertEquals("1 run, 0 failed", result.summary());
    }

    @Test
    public void testFailedResult() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        TestCaseTest test = new TestCaseTest("non-existing-method");
        test.run(result);
        assertEquals("1 run, 1 failed", result.summary());
    }

    @Test
    public void testSuite() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        TestSuite suite = new TestSuite();
        suite.add(new TestCaseTest("testMethod"));
        suite.add(new TestCaseTest("non-existing-method"));
        suite.run(result);
        assertEquals("2 run, 1 failed", result.summary());

    }

    @Before
    public void setUp() {
        result = new TestResult();
    }

    @After
    public void tearDown() {
    }
}