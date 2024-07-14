package ru.learn.patterns.adapter;

import junit.framework.Assert;
import junit.framework.TestCase;
import ru.learn.patterns.adapter.example1.Client;

public class AdapterTest extends TestCase {

    public void testAdapter() {
        Client client = new Client();
        Assert.assertEquals("Surname Name Lastname", client.getFio());
    }
}
