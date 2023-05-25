package com.practice.user.domain;

public class User {
    private String userId;
    private String password;
    private String name;

    public User(String userId, String password, String name){
        this.userId = userId;
        this.password= password;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

}
