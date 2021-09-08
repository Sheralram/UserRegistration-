package com.bridgelabz;

public class UserRegistration {

    public static boolean validInputFirstName(String Fname) throws ValidException {
        String userName = "^[A-Z]{1}[a-z]{2,}$";
        boolean match = Fname.matches(userName);
        if (match) {
            return true;
        } else {
            throw new ValidException(ValidException.ExceptionType.ENTERED_SMALL, "Please enter a valid first name");
        }
    }

    public static boolean validInputLastName(String fname) throws ValidException {
        String UserLastName = "^[A-Z]{1}[a-z]{2,}$";
        boolean match = fname.matches(UserLastName);
        if (match) {
            return true;
        } else {
            throw new ValidException(ValidException.ExceptionType.ENTERED_INVALID, "Please Enter a Valid Last Name");
        }
    }

    public static boolean validPhoneNumber(String number) throws ValidException {
        String phoneRegex = "^\\+?([0-9]{2})\\)?[-]?([0-9]{10})$";
        boolean match = number.matches(phoneRegex);
        if (match) {
            return true;
        } else {
            throw new ValidException(ValidException.ExceptionType.INVALID_PHONE_NUMBER, "Please Enter a Valid Last Name");
        }
    }

    public static boolean validInputCharactersRule(String name) {
        String character = "^\\+?[A-Za-z]{8}$";
        return name.matches(character);

    }

    public boolean validInputEmail(String EmailName) {
        String UserEmail = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*$";
        return EmailName.matches(UserEmail);
    }

    public boolean validInputCharactersRule2(String name) {
        String wordName = "^(?=.*[a-z])(?=.*[A-Z])[a-zA-Z]{8,}$";
        return name.matches(wordName);
    }

    public boolean validInputCharactersRule3(String number) {
        String validonenumeric = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
        return number.matches(validonenumeric);
    }

    public boolean validInputCharactersRule4(String character) throws ValidException {
        String specialCharacter = "^(?=.*[A-Z0-9a-z])(?=.*[!@#$%^&*();]{1}).{8,}$";
        boolean match = character.matches(specialCharacter);
        if (match) {
            return true;
        } else {
            throw new ValidException(ValidException.ExceptionType.INVALID_PASSWORD_CHARACTER, "Please enter Valid Password");
        }
    }

    public String validatedUserRegistration(String Fname, String fname,
                                            String EmailName, String number, String character) throws ValidException {
        if (validInputFirstName(Fname) && validInputLastName(fname) &&
                validInputEmail(EmailName) && validPhoneNumber(number) && validInputCharactersRule4(character))
            return "HAPPY";
        return "SAD";
    }

}

