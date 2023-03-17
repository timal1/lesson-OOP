package seminar1.child;

import seminar1.parent.Animal;

public class Crocodile extends Animal {

    public Crocodile(String kind) {
    }

    @Override
    public void fly() {
        System.out.printf("%s: не может летать%n", getType());
    }
}
