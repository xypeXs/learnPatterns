package ru.learn.patterns.composite;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Composite extends Component {

    private final List<Component> componentList;

    public Composite(String name, String description) {
        super(name, description);
        componentList = new ArrayList<>();
    }

    public void add(Component component) {
        componentList.add(component);
    }

    public void remove(Component component) {
        componentList.remove(component);
    }

    public Component getComponent(int index) {
        return componentList.get(index);
    }

    public void operation(Consumer<Component> consumer) {
        consumer.accept(this);
        componentList.forEach(component -> component.operation(consumer));
    }
}
