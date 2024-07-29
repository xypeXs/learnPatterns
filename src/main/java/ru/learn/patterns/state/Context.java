package ru.learn.patterns.state;

import lombok.Getter;

import java.time.LocalDate;

public class Context {

    @Getter
    private final LocalDate beginDate;

    private State currentState;

    public Context(LocalDate beginDate) {
        this.beginDate = beginDate;
        this.currentState = new DraftState();
    }

    void setState(State state) {
        this.currentState = state;
    }

    public void preprint() {
        currentState.preprint(this);
    }

    public void sign() {
        currentState.sign(this);
    }

    public void cancel() {
        currentState.cancel(this);
    }
}
