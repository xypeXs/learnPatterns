package ru.learn.patterns.composite;

import java.util.function.Consumer;

public class Leaf extends Component {

    public Leaf(String name, String description) {
        super(name, description);
    }

    @Override
    public void operation(Consumer<Component> consumer) {
        consumer.accept(this);
    }
}
