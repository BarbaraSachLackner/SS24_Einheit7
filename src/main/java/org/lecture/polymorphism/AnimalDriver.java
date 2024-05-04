package org.lecture.polymorphism;

public class AnimalDriver {
    public static void main(String[] args) {
        //create an array of animals
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("Ricko");
        animals[1] = new Cat("Sheila");

        // Iterate through the array and invoke makeSound
        // Demonstrates dynamic polymorphism
        for(Animal a : animals) {
            a.makeSound();
        }


        Animal a = new Cat("Martha");
        if (a instanceof Dog d) {
            d.makeSound();
        }
    }
}
