package com.kodilla.good.patterns.challenges.food2door;

import java.util.ArrayList;
import java.util.List;

public class GlutenFreeShop extends Contractor implements ProductList{

    public GlutenFreeShop(String contractorName) {
        super(contractorName);
    }
    @Override
    public List productListOutprint(){
        ProductData avocado = new ProductData(20, "Avocado");
        ProductData pomelo = new ProductData(10, "Pomelo");
        ProductData dragonFruit = new ProductData(5, "Dragon Fruit");
        ProductData apple = new ProductData( 50, "Apple");
        ProductData strawberries = new ProductData(150, "Strawberries");

        List<ProductData> glutenFreeShopProductList = new ArrayList<>();
        glutenFreeShopProductList.add(avocado);
        glutenFreeShopProductList.add(pomelo);
        glutenFreeShopProductList.add(dragonFruit);
        glutenFreeShopProductList.add(apple);
        glutenFreeShopProductList.add(strawberries);

       glutenFreeShopProductList.forEach(System.out::println);

        return glutenFreeShopProductList;
    }
}


