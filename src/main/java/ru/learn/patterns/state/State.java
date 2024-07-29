package ru.learn.patterns.state;

public abstract class State {

    protected String errMessage = "Operation %s is prohibited in %s state";

    public abstract String getStateName();

    public void preprint(Context context) {
        String formattedMessage = String.format(errMessage, "preprint", getStateName());
        throw new IllegalStateException(formattedMessage);
    }

    public void sign(Context context) {
        String formattedMessage = String.format(errMessage, "sign", getStateName());
        throw new IllegalStateException(formattedMessage);
    }

    public void cancel(Context context) {
        String formattedMessage = String.format(errMessage, "cancel", getStateName());
        throw new IllegalStateException(formattedMessage);
    }
}
