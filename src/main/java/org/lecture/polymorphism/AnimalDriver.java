package org.lecture.polymorphism;

public class AnimalDriver {
    public static void main(String[] args) {
        //create an array of animals
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();

        // Iterate through the array and invoke makeSound
        // Demonstrates dynamic polymorphism
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
