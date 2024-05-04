package org.lecture.ddod;

public interface B extends A {

    @Override
    default void foo() {
        System.out.println("B");
    }
}
