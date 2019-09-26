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
        if (contractor != null){
            System.out.println("Your order in " + contractor.getContractorName() + " is " + orderDTO.product + " and it's quantity is " + orderDTO.quantity);
            return new OrderDTO("Avocado", 20);
        }else{
            System.out.println("The order process crashed. Please select the right contractor.");
            return null;
        }
    }
}
