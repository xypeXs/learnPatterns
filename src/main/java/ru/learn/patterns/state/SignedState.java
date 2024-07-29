package ru.learn.patterns.state;

import java.time.LocalDate;
import java.util.Objects;

public class SignedState extends State {

    @Override
    public String getStateName() {
        return "Signed";
    }

    @Override
    public void cancel(Context context) {
        LocalDate todayDate = LocalDate.now();

        if (Objects.equals(todayDate, context.getBeginDate())) {
            System.out.println("Contract is annulled");
            context.setState(new AnnulledState());
        } else {
            System.out.println("Contract is canceled");
            context.setState(new CancelledState());
        }
    }
}
