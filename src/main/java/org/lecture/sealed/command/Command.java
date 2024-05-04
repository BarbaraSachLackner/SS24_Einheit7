package org.lecture.sealed.command;

public sealed abstract class Command
        permits LoginCommand, LogoutCommand, ShowProfileCommand, UserProfileCommand {

    public abstract void perform();

}
