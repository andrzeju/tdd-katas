package pl.com.urbanlab.transitions;

/**
 * Created by andrzej on 03.01.17.
 */
public class StatusTransitionFactory {

    Transition getTransition(Status lastNode, Status nextNode) throws Exception {
        Transition transition;

        switch (lastNode) {
            case NEW:
                if (nextNode == Status.FINISHED) {
                    transition = new NewFinishedTranstion();
                } else {
                    transition = new StartedTranstion();
                }
                break;
            case STARTED:
                if (nextNode == Status.FINISHED) {
                    transition = new FinishedStartedTranstion();
                } else {
                    transition = new PausedStartedTranstion();
                }
                break;
            case NONE :
                transition = new CreateTransition();
                break;
            default:
                throw new Exception("Transition not implemented");
        }

        return transition;
    }

}
