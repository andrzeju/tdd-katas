package pl.com.urbanlab.kentbeck.xunit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by andrzej on 10.12.16.
 */
public class WasRun {
    private final String testMethod;
    public boolean wasRun;

    public WasRun(String testMethod) {
        this.testMethod = testMethod;
    }

    public void testMethod() {
        wasRun = true;
    }

    public void run() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Method met = this.getClass().getDeclaredMethod(this.testMethod);
        met.invoke(this);
    }
}
