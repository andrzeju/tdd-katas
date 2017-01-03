package pl.com.urbanlab.transitions;

import org.junit.Before;
import org.junit.Test;

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
    public void testCreateTask() {
        assertTrue(stf.getTransition(null, Status.NEW) instanceof CreateTransition);
    }

    @Test
    public void testNewTransitions() {
        assertTrue(stf.getTransition(Status.NEW, Status.STARTED) instanceof StartedTranstion);
        assertTrue(stf.getTransition(Status.NEW, Status.FINISHED) instanceof NewFinishedTranstion);
    }

}