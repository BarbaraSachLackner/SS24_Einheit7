package org.lecture.sealed.command;

public final class LogoutCommand extends Command {
    @Override
    public void perform() {
        System.out.println("User is now logged out");
    }
}
