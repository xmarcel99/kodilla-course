package com.kodilla.good.patterns.challenges.food2door;

public class ExtraFoodShop implements DelivererProcess {
    private String delivererName;
    private Product product;

    public ExtraFoodShop(String delivererName, Product product) {
        this.product = product;
        this.delivererName = delivererName;
    }
    public boolean process() {
        System.out.println(delivererName + " is implements order : " + product.getProductName() + ", count: " + product.getProductCount() );
        return true;
    }

    public String getNameOfDeliverer() {
        return  delivererName;
    }
}
