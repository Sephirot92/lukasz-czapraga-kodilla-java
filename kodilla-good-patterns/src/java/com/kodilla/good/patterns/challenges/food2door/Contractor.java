package com.kodilla.good.patterns.challenges.food2door;

public class Contractor implements OrderingProcess{
    private String contractorName;
    protected String isContractorAvaible;

    public Contractor(String contractorName) {
        this.contractorName = contractorName;
    }

    public String getContractorName() {
        return contractorName;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "contractorName='" + contractorName + '\'' +
                '}';
    }

    public String welcomeToTheShop(){
        if (contractorName != null){
            isContractorAvaible = "Welcome to " + contractorName + ". Below you can see our product list: ";
        }else{
            isContractorAvaible = "We are sorry! There is no such contractor cooperating with us.";
        }
        System.out.println(isContractorAvaible);
        return isContractorAvaible;
    }

    @Override
    public String process() {

        if (contractorName != null){
            isContractorAvaible = "\nThank you for making an order in " + contractorName + ". ";
        }else{
            isContractorAvaible = "\nWe are sorry! There is no such contractor cooperating with us.";
        }
        System.out.println(isContractorAvaible);
        return isContractorAvaible;
    }
}
