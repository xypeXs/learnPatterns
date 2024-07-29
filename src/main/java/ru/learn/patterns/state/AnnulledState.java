package ru.learn.patterns.state;

public class AnnulledState extends State {
    @Override
    public String getStateName() {
        return "Annulled";
    }
}
