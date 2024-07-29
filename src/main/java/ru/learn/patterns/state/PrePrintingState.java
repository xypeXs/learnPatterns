package ru.learn.patterns.state;

public class PrePrintingState extends State {

    @Override
    public String getStateName() {
        return "PrePrinting";
    }

    @Override
    public void sign(Context context) {
        System.out.println("Contract is signed");
        context.setState(new SignedState());
    }
}
