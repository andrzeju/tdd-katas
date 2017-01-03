package pl.com.urbanlab.transitions;

/**
 * Created by andrzej on 03.01.17.
 */
public class StatusTransitionFactory {

    Transition getTransition(Status lastNode, Status nextNode) throws Exception {
        Transition transition;

        switch (lastNode) {
            case NEW:
                transition = handleNewNode(nextNode);
                break;
            case STARTED:
                transition = handleStartedNode(nextNode);
                break;
            case NONE :
                transition = new CreateTransition();
                break;
            case FINISHED:
                transition = handleFinishedNode(nextNode);
                break;
            default:
                throw new Exception("Transition not implemented");
        }

        return transition;
    }

    private Transition handleFinishedNode(Status nextNode) {
        Transition transition;
        if (nextNode == Status.PAUSED) {
            transition = new PausedFinishedTranstion();
        } else {
            transition = new ReopenedTranstion();
        }
        return transition;
    }

    private Transition handleStartedNode(Status nextNode) {
        Transition transition;
        if (nextNode == Status.FINISHED) {
            transition = new FinishedStartedTranstion();
        } else {
            transition = new PausedStartedTranstion();
        }
        return transition;
    }

    private Transition handleNewNode(Status nextNode) {
        Transition transition;
        if (nextNode == Status.FINISHED) {
            transition = new NewFinishedTranstion();
        } else {
            transition = new StartedTranstion();
        }
        return transition;
    }

}
