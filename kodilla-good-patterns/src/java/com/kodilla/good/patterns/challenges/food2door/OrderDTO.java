package com.kodilla.good.patterns.challenges.food2door;

public class OrderDTO {

    public String product;
    public int quantity;

    public OrderDTO(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }


}
