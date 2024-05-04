package org.lecture.sealed.command.b1;

public final class ShowProfileCommand extends Command {
    @Override
    public void perform() {
        System.out.println("Show profile");
    }
}
