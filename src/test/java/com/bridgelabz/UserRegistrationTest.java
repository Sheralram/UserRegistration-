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




    }

