package org.lecture.sealed.command.b1;

public final class LoginCommand extends Command {
    @Override
    public void perform() {
        System.out.println("User is logged in");
    }
}
