package com.bridgelabz;

public class ValidException extends Exception {
    enum ExceptionType{
        ENTERED_SMALL,ENTERED_INVALID,INVALID_PASSWORD_CHARACTER,INVALID_PHONE_NUMBER
    }
    ExceptionType type;
    public ValidException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }

}
