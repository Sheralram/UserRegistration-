package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.bridgelabz.UserRegistration;

import java.util.Scanner;

public class UserRegistrationTest {
    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validInputFirstName("Ram");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenImproper_ShouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validInputFirstName("ram");
        Assertions.assertFalse(result);
    }

    @Test
    void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validInputLastName("Sheral");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_whenImproper_shouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validInputLastName("SHERAL");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_whenProper_shouldReturnEmail() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validInputEmail("abc.xyz@bl.co.in");
        boolean result1 = userRegistration.validInputEmail("abc@yahoo.com");
        boolean result2 = userRegistration.validInputEmail("abc-100@yahoo.com");
        boolean result3 = userRegistration.validInputEmail("abc.100@yahoo.com");
        boolean result4 = userRegistration.validInputEmail("abc-100@abc.net");
        boolean result5 = userRegistration.validInputEmail("abc.100@abc.com.au");
        boolean result6 = userRegistration.validInputEmail("abc@1.com");
        boolean result7 = userRegistration.validInputEmail("abc@gmail.com.com");
        boolean result8 = userRegistration.validInputEmail("abc+100@gmail.com");
        boolean result9 = userRegistration.validInputEmail("abc111@abc.net");
        Assertions.assertTrue(result);
        Assertions.assertTrue(result1);
        Assertions.assertTrue(result2);
        Assertions.assertTrue(result3);
        Assertions.assertTrue(result4);
        Assertions.assertTrue(result5);
        Assertions.assertTrue(result6);
        Assertions.assertTrue(result7);
        Assertions.assertTrue(result8);
        Assertions.assertTrue(result9);

    }

    @Test
    public void givenEmail_whenImproper_shouldReturnEmail() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validInputEmail("abc.in");
        boolean result1 = userRegistration.validInputEmail("abc");
        boolean result2 = userRegistration.validInputEmail("abc@.com.my");
        boolean result3 = userRegistration.validInputEmail("abc123@gmail.a");
        boolean result4 = userRegistration.validInputEmail("abc123@.com");
        boolean result5 = userRegistration.validInputEmail("abc123@.com.com");
        boolean result6 = userRegistration.validInputEmail(".abc@abc.com");
        boolean result7 = userRegistration.validInputEmail("abc()*@gmail.com");
        boolean result8 = userRegistration.validInputEmail("abc@%*.com");
        boolean result10 = userRegistration.validInputEmail("abc.@gmail.com");
        boolean result11 = userRegistration.validInputEmail("abc@abc@gmail.com");
        boolean result12 = userRegistration.validInputEmail("abc@gmail.com.1a");
        Assertions.assertFalse(result);
        Assertions.assertFalse(result1);
        Assertions.assertFalse(result2);
        Assertions.assertFalse(result3);
        Assertions.assertFalse(result4);
        Assertions.assertFalse(result5);
        Assertions.assertFalse(result6);
        Assertions.assertFalse(result7);
        Assertions.assertFalse(result8);
        Assertions.assertFalse(result10);
        Assertions.assertFalse(result11);
        Assertions.assertFalse(result12);
    }

    @Test
    public void givenPhoneNumber_whenProper_shouldReturnPhoneNumber() {
        UserRegistration registration = new UserRegistration();
        boolean phoneNumber = registration.validPhoneNumber("918180088568");
        Assertions.assertTrue(phoneNumber);
    }

    @Test
    public void givenPhoneNumber_whenImproper_shouldReturnPhoneNumber() {
        UserRegistration registration = new UserRegistration();
        boolean phoneNumber = registration.validPhoneNumber("ansajjsncj");
        Assertions.assertFalse(phoneNumber);
    }


    @Test

    public void givenCharactersRuleminimum8characters_whenProper_shouldReturnCharactersRule() {
        UserRegistration registration = new UserRegistration();
        boolean answer = registration.validInputCharactersRule("Ramkrish");
        Assertions.assertTrue(answer);
    }

    @Test
    public void givenCharactersRuleminimum8characters_whenImproper_shouldReturnCharactersRule() {
        UserRegistration registration = new UserRegistration();
        boolean answer = registration.validInputCharactersRule("ramkrishn");
        Assertions.assertFalse(answer);
    }

    @Test
    public void givenCharactersRule2atLeast1UpperCase_whenProper_shouldReturnCharactersRule() {
        UserRegistration registration = new UserRegistration();
        boolean answer = registration.validInputCharactersRule2("Ramkrishna");
        Assertions.assertTrue(answer);
    }

    @Test
    public void givenCharactersRule2atLeast1UpperCase_whenImproper_shouldReturnCharactersRule() {
        UserRegistration registration = new UserRegistration();
        boolean answer = registration.validInputCharactersRule2("Ramkris");
        Assertions.assertFalse(answer);
    }


    @Test
    public void givenCharactersRule3atLeast1NumerNumber_whenProper_shouldReturnCharactersRule() {
        UserRegistration registration = new UserRegistration();
        boolean answer = registration.validInputCharactersRule3("Ramkrishna67");
        Assertions.assertTrue(answer);
    }

    @Test
    public void givenCharactersRule3atLeast1NumerNumber_whenImproper_shouldReturnCharactersRule() {
        UserRegistration registration = new UserRegistration();
        boolean answer = registration.validInputCharactersRule3("RamKris");
        Assertions.assertFalse(answer);
    }

    @Test
    public void givenCharactersRule4atleastOneSpecialCharacter_whenProper_shouldReturnCharactersRule4() {
        UserRegistration registration = new UserRegistration();
        boolean answer = registration.validInputCharactersRule4("R@mkrish67");
        Assertions.assertTrue(answer);
    }

    @Test
    public void givenCharactersRule4atleastoneSpecialCharacter_whenImproper_shouldReturnCharactersRule4() {
        UserRegistration registration = new UserRegistration();
        boolean answer = registration.validInputCharactersRule4("R@mKri");
        Assertions.assertFalse(answer);
    }


}
