package org.lecture.sealed.game;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public sealed abstract class Character permits Player, NPC {
    protected String name;

    public void attack(Character target) {
        System.out.printf("%s attacks %s%n", this.name, target.name);
    }

    public void move() {
        System.out.printf("%s moves%n", this.name);
    }
}
