package com.kodilla.good.patterns.challenges.food2door;

public class GlutenFreeShop implements DelivererProcess {
    private String delivererName;
    private Product product;

    public GlutenFreeShop(String delivererName, Product product) {
        this.delivererName = delivererName;
        this.product = product;
    }
    public boolean process() {
        if(product.getProductName().equals("Gluten is The best")) {
            System.out.println(delivererName + " is implements order : " + product.getProductName() + ", count: " + product.getProductCount());
            return true;
        } else {
            return  false;
        }
    }

    public String getNameOfDeliverer() {
        return  delivererName;
    }
}
