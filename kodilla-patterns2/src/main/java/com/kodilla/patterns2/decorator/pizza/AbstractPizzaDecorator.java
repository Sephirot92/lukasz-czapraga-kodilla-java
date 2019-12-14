package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class AbstractPizzaDecorator implements PizzaOrder {
    private final PizzaOrder pizzaOrder;

    public AbstractPizzaDecorator(PizzaOrder pizzaOrder) {
        this.pizzaOrder = pizzaOrder;
    }

    @Override
    public BigDecimal getPizzaCost() {
        return pizzaOrder.getPizzaCost();
    }

    @Override
    public String pizzaDescription() {
        return pizzaOrder.pizzaDescription();
    }
}
