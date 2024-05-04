package org.lecture.sealed.command.b2;

public class UserSpecialProfileCommand extends UserProfileCommand{

    @Override
    public void perform() {
        super.perform();
        System.out.println("Showing special attributes of user profile");
    }
}
