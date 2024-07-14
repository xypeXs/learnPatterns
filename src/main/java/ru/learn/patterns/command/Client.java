package ru.learn.patterns.command;

public class Client {

    public void processCommand() {
        ConcreteReceiver receiver = new ConcreteReceiver();
        ConcreteCommand command = new ConcreteCommand(receiver);

        CommandExecutor executor = new CommandExecutor();
        executor.registerCommand(command, 0);

        executor.execute(0);
        executor.execute(0);
        executor.execute(1);


        executor.rollback(0);
        executor.rollback(0);
        executor.rollback(1);
    }
}
