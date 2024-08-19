package com.booleanuk.core;

public class Login {
    private String email;
    private String password;
    private boolean disabled;

    public Login() {}

    public String createUser(String email, String password, String validatePassword) {
        if( validateEmail(email) && validatePassword(password, validatePassword)) {
            setEmail(email);
            setPassword(password);
            setDisabled(true);
            return "User has now been created.";

        }else if(!validateEmail(email)){
            return "Email is not correct.";
        }
        else if(!validatePassword(password, validatePassword)) {
            return "Password is wrong.";
        }else {
            return "Error creating account";
        }
    }


    public String loginUser(String email, String password) {
        if(email.equals(this.email) && this.password.equals(password)) {
            if(this.disabled) {
                return "Account is disabled, cannot login";
            }else {
                return "Successfully logged in";
            }
        }else {
            return "Email or password does not match";
        }
    }

    private boolean validatePassword(String p1, String p2) {
        if(p1.length() > 8) {
            return p1.equals(p2);
        }else {
            return false;
        }

    }

    private boolean validateEmail(String email) {
        return email.contains("@");
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public boolean isDisabled() {
        return disabled;
    }

    private void setDisabled(boolean disabled) {
        this.disabled = disabled;
    }



}
