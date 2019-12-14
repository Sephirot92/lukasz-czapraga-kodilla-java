package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraHamPizza extends AbstractPizzaDecorator {
    public ExtraHamPizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(8));
    }

    @Override
    public String pizzaDescription() {
        return super.pizzaDescription() + " + ham";
    }
}
