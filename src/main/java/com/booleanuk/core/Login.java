package com.booleanuk.core;

public class Login {
    private String email;
    private String password;
    private boolean disabled;

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
        this.disabled = true;
    }

}
