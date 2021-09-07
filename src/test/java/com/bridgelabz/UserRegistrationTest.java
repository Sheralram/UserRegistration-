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
        //    boolean result = userRegistration.validInputEmail("ram.sheral@gmail.com");
        boolean result = userRegistration.validInputEmail("abc@yahoo.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_whenImproper_shouldReturnEmail() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validInputEmail(",,,,@gmail.com");
        Assertions.assertFalse(result);
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
