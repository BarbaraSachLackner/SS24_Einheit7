package org.lecture.sealed.command.b2;

public class CommandMain {

    public static void main(String[] args) {
        UserSpecialProfileCommand userSpecialProfileCommand = new UserSpecialProfileCommand();
        if (userSpecialProfileCommand instanceof Command command) {
            //Command command = (Command) userSpecialProfileCommand;
            System.out.println("IS A command");
        }
    }
}
