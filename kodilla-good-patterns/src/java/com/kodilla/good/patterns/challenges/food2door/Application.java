package com.kodilla.good.patterns.challenges.food2door;

public class Application {
    public static void main (String [] args){

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("Gluten Free Shop");
        glutenFreeShop.welcomeToTheShop();
        glutenFreeShop.productListOutprint();
        glutenFreeShop.process();

        System.out.println();

        HealthyShop healthyShop = new HealthyShop("Healthy Shop");
        healthyShop.welcomeToTheShop();
        healthyShop.productListOutprint();
        healthyShop.process();

        System.out.println();

        ExtraFoodShop extraFoodShop = new ExtraFoodShop("Extra Food Shop");
        extraFoodShop.welcomeToTheShop();
        extraFoodShop.productListOutprint();
        extraFoodShop.process();

        System.out.println();

        ExtraFoodShop testShop = new ExtraFoodShop(null);
        testShop.welcomeToTheShop();
        testShop.process();

    }
}
