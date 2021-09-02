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
    public void givenLastName_whenImproper_shouldReturnFalse() {
        UserRegistration registration = new UserRegistration();
        boolean result = registration.validInputLastName("SHERAL");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_whenProper_shouldReturnEmail() {
        UserRegistration userRegistration = new UserRegistration();
        boolean result = userRegistration.validInputEmail("ram.sheral@gmail.com");
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
   public void givenCharactersRule_whenProper_shouldReturnCharactersRule() {
        UserRegistration registration = new UserRegistration();
        boolean answer = registration.validInputCharactersRule("Ramkrish");
        Assertions.assertTrue(answer);


    }

}

