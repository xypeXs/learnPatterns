package ru.learn.patterns.command;

import lombok.Getter;

import java.util.Stack;

@Getter
public class CommandExecutor {

    private static final int DEFAULT_COMMAND_ARR_SIZE = 10;
    private Command[] commandArr;
    private Stack<Command> executedCommandStack;

    public CommandExecutor() {
        init(DEFAULT_COMMAND_ARR_SIZE);
    }

    public CommandExecutor(int commandArrSize) {
        init(commandArrSize);
    }

    public void registerCommand(Command command, int posInd) {
        commandArr[posInd] = command;
    }

    public void execute(int posInd) {
        Command command = commandArr[posInd];

        command.execute();
        executedCommandStack.push(command);
    }

    public void rollback(int posInd) {
        if (executedCommandStack.isEmpty())
            return;

        Command command = executedCommandStack.pop();
        command.undo();
    }

    private void init(int commandArrSize) {
        commandArr = new Command[commandArrSize];
        executedCommandStack = new Stack<>();

        for (int i = 0; i < commandArrSize; i++) {
            commandArr[i] = new EmptyCommand();
        }
    }
}
