package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class ExtraFoodShop extends Contractor implements ProductList{

    public ExtraFoodShop(String contractorName) {
        super(contractorName);
    }

    @Override
    public List productListOutprint(){
        ProductData milkByAnn = new ProductData(50, "Milk by Ann");
        ProductData smoothieByAnn = new ProductData(40, "Smoothie by Ann");
        ProductData snackBarByAnn = new ProductData(15, "Snack Bar by Ann");
        ProductData riceByAnn = new ProductData( 50, "Rice by Ann");
        ProductData spaghettiByAnn = new ProductData(250, "Spaghetti by Ann");

        List<ProductData> extraFoodShopProductList = new ArrayList<>();
        extraFoodShopProductList.add(milkByAnn);
        extraFoodShopProductList.add(smoothieByAnn);
        extraFoodShopProductList.add(snackBarByAnn);
        extraFoodShopProductList.add(riceByAnn);
        extraFoodShopProductList.add(spaghettiByAnn);

        extraFoodShopProductList.forEach(System.out::println);

        return extraFoodShopProductList;
    }
}
