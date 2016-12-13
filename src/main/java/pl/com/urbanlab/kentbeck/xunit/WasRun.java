package pl.com.urbanlab.kentbeck.xunit;

/**
 * Created by andrzej on 10.12.16.
 */
public class WasRun extends TestCase {

    public boolean wasRun;
    public String log = "";

    public WasRun(String testMethod) {
        super(testMethod);
    }

    public void setUp() {
        log += "setUp ";
        wasSetUp = true;
    }

    public void tearDown() {
        log += "tearDown";
        wasTearDown = true;
    }

    public void testMethod() {
        log += "testMethod ";
        wasRun = true;
    }

}
