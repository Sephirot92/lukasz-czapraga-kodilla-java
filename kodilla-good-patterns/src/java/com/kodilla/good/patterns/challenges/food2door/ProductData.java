package com.kodilla.good.patterns.challenges.food2door;

public class ProductData {
    private final int productQuantity;
    private final String productType;

    public ProductData(int productQuantity, String productType) {
        this.productQuantity = productQuantity;
        this.productType = productType;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public String getProductType() {
        return productType;
    }

    @Override
    public String toString() {
        return "ProductData{" +
                "productQuantity=" + productQuantity +
                ", productType='" + productType + '\'' +
                '}';
    }
}
