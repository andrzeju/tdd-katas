package pl.com.urbanlab.kentbeck.xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by andrzej on 11.12.16.
 */
public class TestCase {
    protected final String testMethod;

    public TestCase(String testMethod) {
        this.testMethod = testMethod;
    }

    public void run() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method testMethod = this.getClass().getDeclaredMethod(this.testMethod);
        testMethod.invoke(this);
    }
}
