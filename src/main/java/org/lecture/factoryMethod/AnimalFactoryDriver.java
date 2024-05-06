package org.lecture.factoryMethod;

import org.lecture.polymorphism.Animal;
import org.lecture.polymorphism.Dog;

public class AnimalFactoryDriver {

    public static void main(String[] args) {
        AnimalFactory factory = new ConcreteAnimalFactory();
        Animal animal = factory.createAnimal(0, "Ricko");
        System.out.println(animal.getName());
        if (animal instanceof Dog) {
            System.out.println("Is a Dog");
        }
    }
}
