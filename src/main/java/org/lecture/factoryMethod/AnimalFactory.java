package org.lecture.factoryMethod;

import org.lecture.polymorphism.Animal;

//interface Factory Method
public interface AnimalFactory {

    Animal createAnimal(int type, String name);
}
