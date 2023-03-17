package seminar1.child;

import seminar1.parent.Animal;

public class Goose extends Animal {
    public Goose(String name, String color) {
        super(name, color);
    }
    public void hunt() {
        System.out.printf("%s: не может охотиться%n", getType());
    }
}
