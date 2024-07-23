package ru.learn.patterns.facade;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Facade {

    private SubSystem1 subSystem1;
    private SubSystem2 subSystem2;
    private SubSystem3 subSystem3;

    public void start() {
        subSystem1.preconfigure();
        subSystem1.setup();
        subSystem1.start();

        subSystem2.on();

        subSystem3.start();
    }
}
