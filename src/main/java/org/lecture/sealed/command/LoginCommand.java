package org.lecture.sealed.command;

public final class LoginCommand extends Command {
    @Override
    public void perform() {
        System.out.println("User is now logged in");
    }
}
