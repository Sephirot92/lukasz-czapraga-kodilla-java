package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    double score;

    @Autowired
    private Display display;

    public double add(double a, double b) {
        score = a + b;
        display.displayValue(score);
        return score;
    }

    public double sub(double a, double b) {
        score = a - b;
        display.displayValue(score);
        return score;
    }

    public double mul(double a, double b) {
        score = a * b;
        display.displayValue(score);
        return score;
    }

    public double div(double a, double b) {
        score = a / b;
        display.displayValue(score);
        return score;
    }
}
