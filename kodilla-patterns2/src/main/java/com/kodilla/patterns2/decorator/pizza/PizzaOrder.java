package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;
import java.util.Scanner;

public interface PizzaOrder {
    BigDecimal getPizzaCost();

    String pizzaDescription();
}
