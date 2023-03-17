import seminar1.child.*;
import seminar1.parent.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal vaska = new Cat("������", "�����");

        System.out.println(vaska);
        System.out.println(vaska.getType());

        animal.speak();
        vaska.speak();
        Duck duck = new Duck("������", 2);
        System.out.println(duck);
        Dog dog = new Dog("�����", "�����");

        List<Animal> animals = new ArrayList<>();
        animals.add(vaska);
        animals.add(duck);
        animals.add(dog);
        animals.add(animal);
        animals.forEach(Animal::speak);
        System.out.println("--------�������------------");

        for (Animal a: animals) {
            if (a instanceof Duck) {
                ((Duck) a).fly();
            }
        }
        System.out.println("--------�����------------");

        vaska.hunt();


        Animal goose = new Goose("����", "�����");
        goose.fly();
        goose.hunt();
        goose.swim();
        goose.toGo();

        Animal crocodile = new Crocodile("��������");
        crocodile.fly();
        crocodile.hunt();
        crocodile.toGo();
    }
}
