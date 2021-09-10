package com.bridgelabz;

import java.util.regex.Pattern;

interface Validation{
    boolean validate(String regX, String input);
    static void printresult(String regX, String input,String function,Validation fobj ){  //concrete method
         System.out.println("Result of "+function+" is " +fobj.validate(regX, input));
    }
}

public class LambdaValidation {

    public static void main(String[] args) {
        Validation inputcheck = (String regX , String input) -> {
        boolean result = Pattern.matches(regX,input);
        return result ;
            };
            Validation.printresult("^[A-Z]{1}[a-z]{2,}$","Ram","First Name",inputcheck);
            Validation.printresult("^[A-Z]{1}[a-z]{2,}$","Sheral","Last Name",inputcheck);
            Validation.printresult("^\\+?([0-9]{2})\\)?[-]?([0-9]{10})$","91-9850007614","Phone Number",inputcheck);
            Validation.printresult("^(?=.*[A-Z0-9a-z])(?=.*[!@#$%^&*();]{1}).{8,}$","R@mkrish6","Password",inputcheck);
            Validation.printresult("^([a-zA-Z0-9]{3,})(.[a-zA-Z0-9]{3,})?(\\@[a-zA-Z0-9]{1,})(\\.[a-zA-Z]{2,4})+$","ramK6897555@gmail.com","Email id",inputcheck);
    }
}
