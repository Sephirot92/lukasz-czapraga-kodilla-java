package com.kodilla.good.patterns.challenges.food2door;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Application {
    public static void main (String [] args){

     OrderProcessor orderProcessor = new OrderProcessor(new Contractor("GlutenFreeShop"));
     orderProcessor.buyProcess();

     OrderProcessor orderProcessorTest = new OrderProcessor(new Contractor(""));
     orderProcessorTest.buyProcess();
    }
}
