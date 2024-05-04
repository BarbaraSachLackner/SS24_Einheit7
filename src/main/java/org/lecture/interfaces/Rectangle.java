package org.lecture.interfaces;

public class Rectangle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle");
        draw(0,10,10,29);
    }
}
