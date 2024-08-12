package com.digit.Exceptions;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    static List<String> users = new ArrayList<>();

    static void registerUser(String username) throws UserAlreadyExistsException
    {

            if (!users.contains(username))
                users.add(username);
            else
                throw new UserAlreadyExistsException(username+" Already Exits ");



    }
    static void checkUserExistence(String username) throws UserNotFoundException {
//        boolean userExists = false;
        if (users.contains(username))
            System.out.println("User found ");
        else
            throw new UserNotFoundException(username+" not found ");

    }
    public static void main(String[] args) {
//        UserService obj = new UserService()
        try {
            registerUser("azam");
            checkUserExistence("azam");
//            checkUserExistence("maza");
            registerUser("azam");
        } catch (UserAlreadyExistsException e) {
            System.out.println(e.getMessage());

        }
        catch (UserNotFoundException e)
        {
            System.out.println(e);
        }

    }
}
