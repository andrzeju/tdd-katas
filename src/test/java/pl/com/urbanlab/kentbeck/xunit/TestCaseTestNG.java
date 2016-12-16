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

    @Test
    public void testTemplateMethod() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        TestCaseTest test = new TestCaseTest("testMethod");
        assertEquals("", test.log);
        test.run(new TestResult());
        assertEquals("setUp testMethod tearDown", test.log);
    }

    @Test
    public void testResult() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        TestCaseTest test = new TestCaseTest("testMethod");
        TestResult result = new TestResult();
        test.run(result);
        assertEquals("1 run, 0 failed", result.summary());
    }

    @Test
    public void testFailedResult() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        TestCaseTest test = new TestCaseTest("non-existing-method");
        TestResult result = new TestResult();
        test.run(result);
        assertEquals("1 run, 1 failed", result.summary());
    }

    @Test
    public void testSuite() throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        TestSuite suite = new TestSuite();
        suite.add(new TestCaseTest("testMethod"));
        suite.add(new TestCaseTest("non-existing-method"));
        TestResult result = new TestResult();
        suite.run(result);
        assertEquals("2 run, 1 failed", result.summary());

    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }
}