package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop extends BaseShop {
    public GlutenFreeShop(String delivererName, Product product) {
        super(delivererName, product);
    }

    public boolean process() {
        if (getProduct().getProductName().equals("Gluten is The best")) {
            System.out.println(getDelivererName() + " is implements order : " + getProduct().getProductName() + ", count: " + getProduct().getProductCount());
            return true;
        } else {
            return false;
        }
    }
}
