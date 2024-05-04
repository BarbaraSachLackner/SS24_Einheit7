package org.lecture.interfaces;

public interface Drawable {
    int perimeter = 10;
    void draw();

    default void draw(int x, int y, int width, int height) {
        calcuclateCoordinates();
        System.out.println("Drawing...");
    }

    private void calcuclateCoordinates() {
        System.out.println("Calculating coordinates...");
    }
}
