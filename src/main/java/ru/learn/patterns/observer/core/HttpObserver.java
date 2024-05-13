package ru.learn.patterns.observer.core;

import ru.learn.patterns.observer.api.Observer;

import java.util.UUID;

public class HttpObserver<T> implements Observer<T> {

    private final String observerId;
    private final static String message = "HTTP id: %s, data: %s";

    public HttpObserver() {
        observerId = UUID.randomUUID().toString();
    }

    @Override
    public void update(T data) {
        String formattedMessage = String.format(message, observerId, data);
        System.out.println(formattedMessage);
    }
}
