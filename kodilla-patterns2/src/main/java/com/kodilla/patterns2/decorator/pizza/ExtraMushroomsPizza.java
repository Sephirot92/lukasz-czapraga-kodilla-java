package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ExtraMushroomsPizza extends AbstractPizzaDecorator {
    public ExtraMushroomsPizza(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPizzaCost() {
        return super.getPizzaCost().add(new BigDecimal(6));
    }

    @Override
    public String pizzaDescription() {
        return super.pizzaDescription() + " + mushrooms";
    }
}
