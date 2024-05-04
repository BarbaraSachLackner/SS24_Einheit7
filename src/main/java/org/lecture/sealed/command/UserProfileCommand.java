package org.lecture.sealed.command;


//TODO User Profile shall be extendable
public non-sealed class UserProfileCommand extends Command{
    @Override
    public void perform() {
        System.out.println("User Profile Command");
    }
}
