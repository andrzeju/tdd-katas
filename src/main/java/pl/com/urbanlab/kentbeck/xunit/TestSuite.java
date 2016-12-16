package pl.com.urbanlab.kentbeck.xunit;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrzej on 16.12.16.
 */
public class TestSuite {

    private List<TestCase> tests = new ArrayList<TestCase>();

    public void add(TestCaseTest testMethod) {
        tests.add(testMethod);
    }

    public TestResult run(TestResult result) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        for (TestCase tst : tests) {
            tst.run(result);
        }
        return result;
    }
}
