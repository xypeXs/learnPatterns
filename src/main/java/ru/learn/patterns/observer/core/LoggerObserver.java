package ru.learn.patterns.observer.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import ru.learn.patterns.observer.api.Observer;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
public class LoggerObserver<T> implements Observer<T> {

    private String observerId;
    private final static String logMessage = "%s INFO: observer: %s, new data: %s";

    public LoggerObserver() {
        observerId = UUID.randomUUID().toString();
    }

    @Override
    public void update(T data) {
        String formattedMessage = String.format(logMessage, LocalDateTime.now(), observerId, data.toString());
        System.out.println(formattedMessage);
    }
}
