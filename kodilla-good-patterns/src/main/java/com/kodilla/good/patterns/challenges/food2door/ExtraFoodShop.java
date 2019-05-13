package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop extends BaseShop {
    public ExtraFoodShop(String delivererName, Product product) {
        super(delivererName, product);
    }

    public boolean process() {
        System.out.println(getDelivererName() + " is implements order : " + getProduct().getProductName() + ", count: " + getProduct().getProductCount());
        return true;
    }
}
