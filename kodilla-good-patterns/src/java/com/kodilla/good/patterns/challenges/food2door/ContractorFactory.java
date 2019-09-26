package com.kodilla.good.patterns.challenges.food2door;

public class ContractorFactory {
    public Contractor getContractor(String contractorName){
        if (contractorName.equalsIgnoreCase("ExtraFoodShop")){
            return new ExtraFoodShop("ExtraFoodShop");
        }else if(contractorName.equalsIgnoreCase("HealthyShop")){
            return new HealthyShop("HealthyShop");
        }else if(contractorName.equalsIgnoreCase("GlutenFreeShop")){
            return new GlutenFreeShop("GlutenFreeShop");
        }else{
            System.out.println("Warning, no contractor selected.");
            return null;
        }
    }
}
