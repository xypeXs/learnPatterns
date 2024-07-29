package ru.learn.patterns.state;

public class DraftState extends State {

    @Override
    public String getStateName() {
        return "Draft";
    }

    @Override
    public void preprint(Context context) {
        System.out.println("Contract is preprinted");
        context.setState(new PrePrintingState());
    }
}
