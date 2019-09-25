package com.kodilla.good.patterns.challenges.service;

public class Application {
    public static void main (String [] args){
        User buyer = new User("Mark", "markthebuyer89");
        User seller = new User ("Marcus", "robotswillruletheworld");

        ProductToBeSold lampToHouse = new ProductToBeSold("House", "Lamp", 50);
        ProductToBeSold toothbrush = new ProductToBeSold("Hygiene", "Colgate Toothbrush", 100);

        InformationService informationServicePhone = new InformationService("Phone");
        InformationService informationServiceEmail = new InformationService("Email");
        InformationService informationService = new InformationService("None");

        ProductOwnerService productOwnerServiceLamp = new ProductOwnerService(buyer, lampToHouse, seller, informationServicePhone);
        productOwnerServiceLamp.getInformationService().isInformationAvaible();

        ProductOwnerService productOwnerServiceToothbrush = new ProductOwnerService(buyer, lampToHouse, seller, informationServiceEmail);
        productOwnerServiceToothbrush.getInformationService().isInformationAvaible();

        ProductOwnerService productOwnerServiceLampBigOrder = new ProductOwnerService(buyer, lampToHouse, seller, informationService);
        productOwnerServiceLampBigOrder.getInformationService().isInformationAvaible();
    }
}
