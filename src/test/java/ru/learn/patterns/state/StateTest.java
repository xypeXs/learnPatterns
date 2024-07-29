package ru.learn.patterns.state;

import junit.framework.Assert;
import junit.framework.TestCase;

import java.time.LocalDate;

public class StateTest extends TestCase {

    public void testSuccessAnnulled() {

        System.out.println("testSuccessAnnulled");

        Context context = createTodayContext();

        context.preprint();
        context.sign();
        context.cancel();

        System.out.println("---------------------------------------------------------");
    }

    public void testSuccessCancel() {
        System.out.println("testSuccessCancel");

        Context context = createTomorrowContext();

        context.preprint();
        context.sign();
        context.cancel();

        System.out.println("---------------------------------------------------------");
    }

    public void testStateError() {
        System.out.println("testStateError");

        Context context = createTodayContext();

        assertThrows(context::sign);
        assertThrows(context::cancel);

        context.preprint();
        assertThrows(context::preprint);
        assertThrows(context::cancel);

        context.sign();
        assertThrows(context::preprint);
        assertThrows(context::sign);

        context.cancel();
        assertThrows(context::preprint);
        assertThrows(context::sign);
        assertThrows(context::cancel);

        System.out.println("---------------------------------------------------------");
    }

    private void assertThrows(Caller caller) {
        try {
            caller.call();
            Assert.fail();
        } catch (IllegalStateException e) {
            System.out.println("--- " + e.getMessage());
        }
    }

    private Context createTodayContext() {
        return new Context(LocalDate.now());
    }

    private Context createTomorrowContext() {
        LocalDate today = LocalDate.now();
        return new Context(today.plusDays(1));
    }

    @FunctionalInterface
    public interface Caller {
        void call();
    }
}
