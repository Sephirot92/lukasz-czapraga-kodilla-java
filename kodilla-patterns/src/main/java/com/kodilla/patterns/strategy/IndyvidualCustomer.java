package com.kodilla.patterns.strategy;

public class IndyvidualCustomer extends Customer {
    public IndyvidualCustomer(String name) {
        super(name);
        this.buyPredictor = new ConservativePredictor();
    }
}
