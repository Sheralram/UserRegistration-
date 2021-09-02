package com.bridgelabz;

public class UserRegistration {
    public static boolean validInputFirstName(String Fname) {
        String USER_NAME = "^[A-Z]{1}[a-z]{2,}$";
        return Fname.matches(USER_NAME);

    }

    public static boolean validInputLastName(String fname) {
        String UserLastName = "^[A-Z]{1}[a-z]{2,}$";
        return fname.matches(UserLastName);
    }

    public boolean validInputEmail(String EmailName) {
String UserEmail = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
return EmailName.matches(UserEmail);
    }

    public static boolean validPhoneNumber(String number){
        String phoneRegex = "^\\+?([0-9]{2})\\)?[-]?([0-9]{10})$";
        return number.matches(phoneRegex);
    }

    public static boolean validInputCharactersRule(String name) {
        String character = "^\\+?[A-Za-z]{8}$";
        return  name.matches(character);

    }
}

