package com.kodilla.good.patterns.challenges.food2door;

public class OrderProcessor {
    private Contractor contractor;
    private String product;
    private int quantity;

    public OrderProcessor(Contractor contractor) {
        this.contractor = contractor;
    }

    public Contractor getContractor() {
        return contractor;
    }

    public OrderDTO buyProcess (){
        OrderDTO orderDTO = new OrderDTO("Avocado", 20);

        ContractorFactory contractorFactory = new ContractorFactory();

        if (contractor.getContractorName().equalsIgnoreCase("HealthyShop")){
            OrderProcessor orderProcessor = new OrderProcessor(contractorFactory.getContractor("HealthyShop"));
        }else if(contractor.getContractorName().equalsIgnoreCase("ExtraFoodShop")){
            OrderProcessor orderProcessor = new OrderProcessor(contractorFactory.getContractor("ExtraFoodShop"));
        }else if(contractor.getContractorName().equalsIgnoreCase("GlutenFreeShop")){
            OrderProcessor orderProcessor = new OrderProcessor(contractorFactory.getContractor("GlutenFreeShop"));
        }

        contractor.welcomeToTheShop();
        contractor.productListOutprint();


        if (contractor != null && contractor.getContractorName() != ""){
            System.out.println("Your order in " + contractor.getContractorName() + " is " + orderDTO.product + " and it's quantity is " + orderDTO.quantity);
            contractor.process();
            return new OrderDTO("Avocado", 20);
        }else{
            System.out.println("The order process crashed. Please select the right contractor.");
            return null;
        }

    }
}
