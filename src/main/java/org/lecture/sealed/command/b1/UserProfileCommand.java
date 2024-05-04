package org.lecture.sealed.command.b1;

public non-sealed class UserProfileCommand extends Command {
    @Override
    public void perform() {
        System.out.println("Showing User Profile");
    }
}
