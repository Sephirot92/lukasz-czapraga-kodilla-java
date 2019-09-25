package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class HealthyShop extends Contractor implements ProductList{
    public HealthyShop(String contractorName) {
        super(contractorName);
    }
    @Override
    public List productListOutprint(){
        ProductData beef = new ProductData(50, "Beef");
        ProductData lamb = new ProductData(40, "Lamb");
        ProductData frogMeat = new ProductData(15, "Frog Meat");
        ProductData duck = new ProductData( 50, "Duck");
        ProductData eggs = new ProductData(250, "Eggs");

        List<ProductData> healthyShopProductList = new ArrayList<>();
        healthyShopProductList.add(beef);
        healthyShopProductList.add(lamb);
        healthyShopProductList.add(frogMeat);
        healthyShopProductList.add(duck);
        healthyShopProductList.add(eggs);

        healthyShopProductList.forEach(System.out::println);

        return healthyShopProductList;
    }
}
