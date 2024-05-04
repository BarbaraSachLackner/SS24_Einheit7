package org.lecture.sealed.game;

public sealed class Player extends Character permits Alex, Steve {

    public Player(String name) {
        super(name);
    }
}
