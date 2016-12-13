package pl.com.urbanlab.kentbeck.xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by andrzej on 11.12.16.
 */
public abstract class TestCase {
    protected String testMethod;

    public TestCase() {}
    public TestCase(String testMethod) {
        this.testMethod = testMethod;
    }

    public abstract void setUp();
    public abstract void tearDown();

    public TestResult run() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        setUp();
        TestResult result = new TestResult();
        try {
            Method testMethod = this.getClass().getDeclaredMethod(this.testMethod);
            testMethod.invoke(this);
        } catch (Exception e) {
            result.popFailed();
        } finally {
            tearDown();
        }
        return result;
    }
}
