package com.kodilla.good.patterns.challenges.service;

public class Buyer {
    private String name;
    private String indyvidualLogin;

    public Buyer(String name, String indyvidualLogin) {
        this.name = name;
        this.indyvidualLogin = indyvidualLogin;
    }

    public String getName() {
        return name;
    }

    public String getIndyvidualLogin() {
        return indyvidualLogin;
    }
}
