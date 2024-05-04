package org.lecture.factoryMethod;

import org.lecture.polymorphism.Animal;

public class AnimalFactoryDriver {

    public static void main(String[] args) {
        AnimalFactory factory = new ConcreteAnimalFactory();
        Animal animal = factory.createAnimal(0, "Ricko");
        System.out.println(animal.getName());
    }
}
