package com.lucifer.pigeon.demo;

import java.io.Serializable;
/**
 * 必须实现java.io.Serializable接口!!!
 * */
public class UserImpl implements User, Serializable {

    private String username;

    public UserImpl(String username) {
        this.username = username;
    }

    @Override
    public String getUsername() {
        return username;
    }


    @Override
    public String toString() {
        return "UserImpl{" +
                "username='" + username + '\'' +
                '}';
    }
}