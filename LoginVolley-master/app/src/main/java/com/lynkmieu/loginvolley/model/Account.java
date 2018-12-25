package com.lynkmieu.loginvolley.model;

import java.io.Serializable;

/**
 * Created by LynkMieu on 20/08/2016.
 */
public class Account implements Serializable {

    private String userName;
    private String email;

    public Account() {
    }

    public Account(String userName, String email) {
        this.userName = userName;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
