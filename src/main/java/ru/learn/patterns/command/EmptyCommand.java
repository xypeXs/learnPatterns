package ru.learn.patterns.command;

public class EmptyCommand implements Command {
    @Override
    public void execute() {
        // do nothing
    }

    @Override
    public void undo() {
        // do nothing
    }
}
