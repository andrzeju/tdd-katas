package pl.com.urbanlab.kentbeck.xunit;

/**
 * Created by andrzej on 13.12.16.
 */
public class TestResult {

    private int run;
    private int failed;

    public TestResult() {
        run = 0;
        failed = 0;
    }

    public String summary() {
        return run + " run, " + failed + " failed";
    }

    public void popFailed() {
        failed++;
    }

    public void popRun() {
        run++;
    }
}
