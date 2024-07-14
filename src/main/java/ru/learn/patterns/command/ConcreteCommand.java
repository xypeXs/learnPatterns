package ru.learn.patterns.command;

public class ConcreteCommand implements Command {

    private final ConcreteReceiver receiver;

    public ConcreteCommand(ConcreteReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.on();
    }

    @Override
    public void undo() {
        receiver.off();
    }
}
