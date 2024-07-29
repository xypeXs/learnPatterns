package ru.learn.patterns.state;

public class CancelledState extends State {

    @Override
    public String getStateName() {
        return "Cancelled";
    }
}
