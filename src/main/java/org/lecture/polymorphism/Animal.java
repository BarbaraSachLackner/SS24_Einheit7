package org.lecture.polymorphism;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public abstract class Animal {
    protected String name;
    public abstract void makeSound();
}
