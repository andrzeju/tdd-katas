package pl.com.urbanlab.kentbeck.xunit;

/**
 * Created by andrzej on 10.12.16.
 */
public class WasRun extends TestCase {

    public boolean wasRun;

    public WasRun(String testMethod) {
        super(testMethod);
    }

    public void setUp() {
        wasSetUp = true;
    }

    public void testMethod() {
        wasRun = true;
    }

}
