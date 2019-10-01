package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    private Contractor contractor;
    private String product;
    private int quantity;


    public OrderDTO buyProcess(String contractorName, OrderDTO orderDTO) {

        ContractorFactory contractorFactory = new ContractorFactory();
        Contractor contractor = contractorFactory.getContractor(contractorName);

        contractor.welcomeToTheShop();
        contractor.productListOutprint();


        if (contractor != null && contractor.getContractorName() != "") {
            System.out.println("Your order in " + contractor.getContractorName() + " is " + orderDTO.product + " and it's quantity is " + orderDTO.quantity);
            contractor.process();
            return new OrderDTO("Avocado", 20);
        } else {
            System.out.println("The order process crashed. Please select the right contractor.");
            return null;
        }

    }
}
