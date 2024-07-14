package ru.learn.patterns.command;

import junit.framework.TestCase;

public class CommandTest extends TestCase {

    public void testCommand() {
        Client client = new Client();
        client.processCommand();
    }
}
