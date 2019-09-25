package com.kodilla.good.patterns.challenges.service;

public class ProductOwnerService {
    private User buyer;
    private ProductToBeSold productToBeSold;
    private User seller;
    private InformationService informationService;

    public ProductOwnerService(User buyer, ProductToBeSold productToBeSold, User seller, InformationService informationService) {
        this.buyer = buyer;
        this.productToBeSold = productToBeSold;
        this.seller = seller;
        this.informationService = informationService;
    }

    public User getBuyer() {
        return buyer;
    }

    public ProductToBeSold getProductToBeSold() {
        return productToBeSold;
    }

    public User getSeller() {
        return seller;
    }

    public InformationService getInformationService() {
        return informationService;
    }

    @Override
    public String toString() {
        return "ProductOwnerService{" +
                "buyer=" + buyer +
                ", productToBeSold=" + productToBeSold +
                ", seller=" + seller +
                ", informationService=" + informationService +
                '}';
    }
}
