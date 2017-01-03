package pl.com.urbanlab.transitions;

/**
 * Created by andrzej on 03.01.17.
 */
public class StatusTransitionFactory {

    Transition getTransition(Status lastNode, Status nextNode) {
        Transition transition;
        if (lastNode == Status.NEW) {
            if (nextNode == Status.FINISHED) {
                transition = new NewFinishedTranstion();
            } else {
                transition = new StartedTranstion();
            }
        } else {
            transition = new CreateTransition();
        }
        return transition;
    }

}
