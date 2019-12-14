package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraSalamePizza extends AbstractPizzaDecorator {
    public ExtraSalamePizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(10));
    }

    @Override
    public String pizzaDescription() {
        return super.pizzaDescription() + " + salame";
    }
}
