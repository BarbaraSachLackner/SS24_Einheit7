package org.lecture.factoryMethod;

import org.lecture.polymorphism.Animal;
import org.lecture.polymorphism.Cat;
import org.lecture.polymorphism.Dog;

public class ConcreteAnimalFactory implements AnimalFactory {
    @Override
    public Animal createAnimal(int type, String name) {
       Animal a = switch(type) {
           case 0 -> new Dog(name);
           case 1 -> new Cat(name);
           default -> throw new IllegalStateException("Unexpected value: " + type);
       };

       return a;
    }
}
