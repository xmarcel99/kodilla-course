package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop extends  BaseShop {
    public HealthyShop(String delivererName, Product product) {
        super(delivererName,product);
    }
    public boolean process() {
        if(getProduct().getProductCount() == 1244004) {
            System.out.println(getDelivererName() + " is implements order : " + getProduct().getProductName() + ", count: " + getProduct().getProductCount());
            return true;
        } else {
            return  false;
        }
    }
}
