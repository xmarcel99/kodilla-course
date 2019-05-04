package com.kodilla.good.patterns.challenges.food2door;

public class HealthyShop implements  DelivererProcess {
    private String delivererName;
    private Product product;

    public HealthyShop(String delivererName, Product product) {
        this.delivererName = delivererName;
        this.product = product;
    }
    public boolean process() {
        if(product.getProductCount() == 1244004) {
            System.out.println(delivererName + " is implements order : " + product.getProductName() + ", count: " + product.getProductCount() );
            return true;
        } else {
            return  false;
        }
    }
    public String getNameOfDeliverer() {
        return  delivererName;
    }
}
