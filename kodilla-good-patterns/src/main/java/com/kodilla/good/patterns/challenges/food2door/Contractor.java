package com.kodilla.good.patterns.challenges.food2door;

import java.util.List;

public class Contractor implements OrderMasterInterface {
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

    public String welcomeToTheShop() {
        if (contractorName != "" && contractorName != null) {
            isContractorAvaible = "Welcome to " + contractorName;
        } else {
            isContractorAvaible = "We are sorry! There is no such contractor cooperating with us.";
        }
        System.out.println(isContractorAvaible);
        return isContractorAvaible;
    }

    @Override
    public String process() {

        if (contractorName != "" && contractorName != null) {
            isContractorAvaible = "Thank you for making an order in " + contractorName + ". \n";
        } else {
            isContractorAvaible = "We are sorry! There is no such contractor cooperating with us.\n";
        }
        System.out.println(isContractorAvaible);
        return isContractorAvaible;
    }

    @Override
    public List productListOutprint() {
        return null;
    }
}
