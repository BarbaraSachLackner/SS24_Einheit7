package org.lecture.sealed.command;

public final class ShowProfileCommand extends Command {
    @Override
    public void perform() {
        System.out.println("Showing profile...");
    }
}
