package org.lecture.ddod;

public interface C extends A {

    @Override
    default void foo() {
        System.out.println("calling interface C");
    }
}
