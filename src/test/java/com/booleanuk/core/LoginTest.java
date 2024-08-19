package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    public void createUserTest() {
        Login login = new Login();

        Assertions.assertEquals("User has now been created.", login.createUser("Leo@test.com", "Password123", "Password123"));
    }

    @Test
    public void loginUser() {

    }
}
