package com.kodilla.good.patterns.challenges.food2door;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Application {
    public static void main (String [] args){

     ContractorFactory contractorFactory = new ContractorFactory();


     OrderProcessor orderProcessor = new OrderProcessor(contractorFactory.getContractor("HealthyShop"));
     orderProcessor.getContractor().welcomeToTheShop();
     orderProcessor.buyProcess();
     orderProcessor.getContractor().process();


     orderProcessor = new OrderProcessor(contractorFactory.getContractor("ExtraFoodShop"));
     orderProcessor.getContractor().welcomeToTheShop();
     orderProcessor.buyProcess();
     orderProcessor.getContractor().process();

     orderProcessor = new OrderProcessor(contractorFactory.getContractor("GlutenFreeShop"));
     orderProcessor.getContractor().welcomeToTheShop();
     orderProcessor.buyProcess();
     orderProcessor.getContractor().process();


    }
}
