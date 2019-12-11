package com.kodilla.testing.calculator;

public class Calculator {
    private int a, b;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return this.a;
    }

    public int getB() {
        return this.b;
    }

    public int addAToB() {
        return a + b;
    }

    public int substractAFromB() {
        return a - b;
    }

    @Override
    public String toString() {
        return a + " " + b;
    }
}
