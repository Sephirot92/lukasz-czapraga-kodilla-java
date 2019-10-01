package com.kodilla.good.patterns.challenges.service;

public class User {
    private String name;
    private String indyvidualLogin;

    public User(String name, String indyvidualLogin) {
        this.name = name;
        this.indyvidualLogin = indyvidualLogin;
    }

    public String getName() {
        return name;
    }

    public String getIndyvidualLogin() {
        return indyvidualLogin;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", indyvidualLogin='" + indyvidualLogin + '\'' +
                '}';
    }
}