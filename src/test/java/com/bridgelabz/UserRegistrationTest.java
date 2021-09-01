package com.bridgelabz;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import com.bridgelabz.UserRegistration;

import java.util.Scanner;

public class UserRegistrationTest {
    @Test
        public void  givenFirstName_WhenProper_ShouldReturnTrue() {
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
    void givenLastName_whenImproper_shouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validInputLastName("SHERAL");
        Assertions.assertFalse(result);
    }

    @Test
    void givenEmail_whenProper_shouldReturnEmail() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validInputEmail("ram.sheral@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    void givenEmail_whenImproper_shouldReturnEmail() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validInputEmail(",,,,@gmail.com");
        Assertions.assertFalse(result);
    }

}

