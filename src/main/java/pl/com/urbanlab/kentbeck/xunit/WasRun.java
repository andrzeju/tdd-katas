package pl.com.urbanlab.kentbeck.xunit;

/**
 * Created by andrzej on 10.12.16.
 */
public class WasRun extends TestCase {

    public String log = "";

    public WasRun(String testMethod) {
        super(testMethod);
    }

    public void setUp() {
        log += "setUp ";
    }

    public void tearDown() {
        log += "tearDown";
    }

    public void testMethod() {
        log += "testMethod ";
    }

}
