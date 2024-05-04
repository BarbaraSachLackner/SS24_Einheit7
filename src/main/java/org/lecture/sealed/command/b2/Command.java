package org.lecture.sealed.command.b2;

public sealed abstract class Command
        permits LoginCommand, LogoutCommand, ShowProfileCommand, UserProfileCommand {

    public abstract void perform();

}
