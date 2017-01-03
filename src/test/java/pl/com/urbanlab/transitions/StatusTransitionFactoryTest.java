package pl.com.urbanlab.transitions;

import org.junit.Before;
import org.junit.Test;
import pl.com.urbanlab.transitions.types.*;

import static org.junit.Assert.*;

/**
 * Created by andrzej on 03.01.17.
 */
public class StatusTransitionFactoryTest {

    private StatusTransitionFactory stf;

    @Before
    public void setUp() {
        stf = new StatusTransitionFactory();
    }

    @Test
    public void testCreateTask() throws Exception {
        assertTrue(stf.getTransition(Status.NONE, Status.NEW, false) instanceof CreateTransition);
    }

    @Test
    public void testNewTransitions() throws Exception {
        assertTrue(stf.getTransition(Status.NEW, Status.STARTED, false) instanceof StartedTranstion);
        assertTrue(stf.getTransition(Status.NEW, Status.FINISHED, false) instanceof NewFinishedTranstion);
    }

    @Test
    public void testStartedTransitions() throws Exception {
        assertTrue(stf.getTransition(Status.STARTED, Status.PAUSED, false) instanceof PausedStartedTranstion);
        assertTrue(stf.getTransition(Status.STARTED, Status.FINISHED, false) instanceof FinishedStartedTranstion);
    }

    @Test
    public void testFinishedTransitions() throws Exception {
        assertTrue(stf.getTransition(Status.FINISHED, Status.REOPEN, false) instanceof ReopenedTranstion);
        assertTrue(stf.getTransition(Status.FINISHED, Status.PAUSED, false) instanceof PausedFinishedTranstion);
    }

    @Test
    public void testEditTransition() throws Exception {
        assertTrue(stf.getTransition(Status.NEW, Status.NEW, false) instanceof EditTranstion);
        assertTrue(stf.getTransition(Status.STARTED, Status.STARTED, false) instanceof EditTranstion);
        assertTrue(stf.getTransition(Status.PAUSED, Status.PAUSED, false) instanceof EditTranstion);
        assertTrue(stf.getTransition(Status.FINISHED, Status.FINISHED, false) instanceof EditTranstion);
        assertTrue(stf.getTransition(Status.REOPEN, Status.REOPEN, false) instanceof EditTranstion);
    }

    @Test
    public void testForwardTransition() throws Exception {
        boolean ownerChanged = true;
        assertTrue(stf.getTransition(Status.NEW, Status.NEW, ownerChanged) instanceof ForwardTranstion);
        assertTrue(stf.getTransition(Status.STARTED, Status.STARTED, ownerChanged) instanceof ForwardTranstion);
    }

}