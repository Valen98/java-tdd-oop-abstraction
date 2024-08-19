package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginTest {

    @Test
    public void createUserTest() {
        Login login = new Login("Leo@test.com", "Password");


        Assertions.assertEquals("Leo@test.com", login.getEmail());
    }
}
