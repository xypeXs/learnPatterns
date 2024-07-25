package ru.learn.patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.function.Consumer;

@Getter
@AllArgsConstructor
public abstract class Component {

    private String name;
    private String description;

    public abstract void operation(Consumer<Component> consumer);

}
