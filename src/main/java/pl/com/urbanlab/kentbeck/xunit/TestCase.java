package pl.com.urbanlab.kentbeck.xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by andrzej on 11.12.16.
 */
public abstract class TestCase {
    protected final String testMethod;
    public boolean wasSetUp;

    public TestCase(String testMethod) {
        this.testMethod = testMethod;
    }

    public abstract void setUp();

    public void run() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        setUp();
        Method testMethod = this.getClass().getDeclaredMethod(this.testMethod);
        testMethod.invoke(this);
    }
}
