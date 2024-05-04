package org.lecture.sealed.command.b1;

public final class LogoutCommand extends Command{
    @Override
    public void perform() {
        System.out.println("User is logged out");
    }
}
