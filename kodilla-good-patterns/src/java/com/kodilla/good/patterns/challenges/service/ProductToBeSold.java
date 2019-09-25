package com.kodilla.good.patterns.challenges.service;

public class ProductToBeSold {
    private String productCategory;
    private String productName;
    private int productPossibleQuantity;

    public ProductToBeSold(String productCategory, String productName, int productQuantity) {
        this.productCategory = productCategory;
        this.productName = productName;
        this.productPossibleQuantity = productQuantity;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPossibleQuantity() {
        return productPossibleQuantity;
    }

    @Override
    public String toString() {
        return "ProductToBeSold{" +
                "productCategory='" + productCategory + '\'' +
                ", productName='" + productName + '\'' +
                ", productPossibleQuantity=" + productPossibleQuantity +
                '}';
    }
}
