package com.example.shubu.peb;

import java.io.Serializable;

/**
 * Created by shubu on 6/22/2017.
 */

public class User implements Serializable {
    String name, username, password;
    int age;

    public User(String name, int age, String username, String password) {
        this.name = name;
        this.age = age;
        this.username = username;
        this.password = password;
    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.age = -1;
        this.name = "";
    }
}
