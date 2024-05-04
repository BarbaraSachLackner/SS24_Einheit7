package org.lecture.sealed.game;

public non-sealed class NPC extends Character {

    public NPC(String name) {
        super(name);
    }

    public void defend(Character character) {
        if (character instanceof NPC npc) {
            System.out.printf("%s aligns with %s", this.name, npc.name);
        } else if (character instanceof Player player) {
            System.out.printf("%s defends itself against %s", this.name, player.name);
        }
    }
}
