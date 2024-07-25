package ru.learn.patterns.composite;

import junit.framework.TestCase;

public class CompositeTest extends TestCase {

    public void testComposite() {
        Composite parentComposite = createComposite("parent");
        Composite childComposite1 = createComposite("child 1");
        Composite childComposite2 = createComposite("child 2");
        Composite childComposite3 = createComposite("child 3");

        childComposite1.add(createLeaf("leaf 1"));
        childComposite1.add(createLeaf("leaf 2"));
        childComposite1.add(createLeaf("leaf 3"));

        parentComposite.add(childComposite1);
        parentComposite.add(childComposite2);
        parentComposite.add(childComposite3);

        parentComposite.operation(this::print);
    }

    private Composite createComposite(String name) {
        return new Composite(name, "this is composite");
    }

    private Leaf createLeaf(String name) {
        return new Leaf(name, "this is leaf");
    }

    private void print(Component component) {
        System.out.println(component.getName() + " " + component.getClass().getName());
        System.out.println("   --- " + component.getDescription());
    }
}
