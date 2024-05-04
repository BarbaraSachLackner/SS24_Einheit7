package org.lecture.ddod;

public class D implements B, C{

    @Override
    public void foo() {
        C.super.foo();
    }

    @Override
    public void bar() {
        System.out.println("Another method via interface B");
    }
}
