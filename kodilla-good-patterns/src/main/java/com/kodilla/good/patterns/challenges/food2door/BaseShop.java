package com.kodilla.good.patterns.challenges.food2door;

public abstract class BaseShop {
    private String delivererName;
    private Product product;

    public BaseShop(String delivererName, Product product) {
        this.delivererName = delivererName;
        this.product = product;
    }

    public String getDelivererName() {
        return delivererName;
    }

    public Product getProduct() {
        return product;
    }

    abstract public boolean process();
}
