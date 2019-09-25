package com.kodilla.good.patterns.challenges.service;

public class InformationService {
    private String possibleWaysToInform;

    public InformationService(String possibleWaysToInform) {
        this.possibleWaysToInform = possibleWaysToInform;
    }

    public String getPossibleWaysToInform() {
        return possibleWaysToInform;
    }

    public boolean isInformationAvaible(){
        boolean informationPossibility;
        if (possibleWaysToInform == "Phone"){
            System.out.println("Client will be informed by SMS");
            informationPossibility = true;
        }else if (possibleWaysToInform == "Email"){
            System.out.println("Client will be informed by an Email");
            informationPossibility = true;
        }else {
            System.out.println("There is no option to contact with this client");
            informationPossibility = false;
        }
        return informationPossibility;
    }

    @Override
    public String toString() {
        return "InformationService{" +
                "possibleWaysToInform='" + possibleWaysToInform + '\'' +
                '}';
    }

}
