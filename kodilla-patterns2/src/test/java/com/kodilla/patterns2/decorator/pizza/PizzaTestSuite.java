package com.kodilla.patterns2.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaTestSuite {
    @Test
    public void testBasicPizzaGetCost() {
        //Given
        PizzaOrder pizzaOrder = new BasicPizza();
        //When
        BigDecimal cost = pizzaOrder.getPizzaCost();
        //Then
        assertEquals(new BigDecimal(15), cost);
    }

    @Test
    public void testBasicPizzaGetDescription() {
        //Given
        PizzaOrder order = new BasicPizza();
        //When
        String description = order.pizzaDescription();
        //Then
        assertEquals("Ordered basic pizza", description);
    }

    @Test
    public void testPizzaWithMushroomsGetCost() {
        //Given
        PizzaOrder order = new BasicPizza();
        order = new ExtraMushroomsPizza(order);
        //When
        BigDecimal cost = order.getPizzaCost();
        //Then
        assertEquals(new BigDecimal(21), cost);
    }

    @Test
    public void testPizzaWithMushroomsGetDescription() {
        //Given
        PizzaOrder order = new BasicPizza();
        order = new ExtraMushroomsPizza(order);
        //When
        String description = order.pizzaDescription();
        //Then
        assertEquals("Ordered basic pizza + mushrooms", description);
    }

    @Test
    public void testPizzaWithMushroomsCheeseGetCost() {
        //Given
        PizzaOrder order = new BasicPizza();
        order = new ExtraMushroomsPizza(order);
        order = new ExtraCheesyPizza(order);
        //when
        BigDecimal cost = order.getPizzaCost();
        //then
        assertEquals(new BigDecimal(26), cost);
    }

    @Test
    public void testPizzaWithMushroomsCheeseGetDescription() {
        //Given
        PizzaOrder order = new BasicPizza();
        order = new ExtraMushroomsPizza(order);
        order = new ExtraCheesyPizza(order);
        //When
        String description = order.pizzaDescription();
        //Then
        assertEquals("Ordered basic pizza + mushrooms + cheese", description);
    }

    @Test
    public void testPizzaWithHamSalameOnionCost() {
        //given
        PizzaOrder order = new BasicPizza();
        order = new ExtraHamPizza(order);
        order = new ExtraSalamePizza(order);
        order = new ExtraOnionPizza(order);
        //when
        BigDecimal cost = order.getPizzaCost();
        //then
        assertEquals(new BigDecimal(37), cost);
    }

    @Test
    public void testPizzaWithHamSalameOnionDescription() {
        //given
        PizzaOrder order = new BasicPizza();
        order = new ExtraHamPizza(order);
        order = new ExtraSalamePizza(order);
        order = new ExtraOnionPizza(order);

        //when
        String description = order.pizzaDescription();

        //then
        assertEquals("Ordered basic pizza + ham + salame + onion", description);
    }
}
