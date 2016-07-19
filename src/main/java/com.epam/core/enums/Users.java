package com.epam.core.enums;

/**
 * Created by Andrii_Chorniak on 7/4/2016.
 */
public enum Users {

    VALID_USER("andrey.chornyak@mail.ru", "Qwerty12345."),
    FAKE_USER("fakeUser@gmail.com", "qwerty12345.");

    Users(String email, String password) {
        this.email = email;
        this.password = password;
    }

    private String email;
    private String password;

    public String getEmail(){return email;}
    public String getPassword(){return password;}

}
