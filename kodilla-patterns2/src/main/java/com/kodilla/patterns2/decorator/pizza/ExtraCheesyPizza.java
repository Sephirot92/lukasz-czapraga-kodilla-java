package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraCheesyPizza extends AbstractPizzaDecorator {
    public ExtraCheesyPizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(5));
    }

    @Override
    public String pizzaDescription() {
        return super.pizzaDescription() + " + cheese";
    }
}
