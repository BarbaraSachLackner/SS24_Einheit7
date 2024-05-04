package org.lecture.sealed.game;

public sealed abstract class Player extends Character permits Alex, Steve {

    public Player(String name) {
        super(name);
    }
}
