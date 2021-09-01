package com.bridgelabz;

public class UserRegistration {
    public static boolean validInputFirstName(String Fname) {
        String USER_NAME = "^[A-Z]{1}[a-z]{2,}$";
        return Fname.matches(USER_NAME);

    }
}
//  "^[A-Za-z]{8,}$";
