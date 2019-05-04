package com.kodilla.good.patterns.challenges.food2door;

public class Order {
    private String productName;
    private int countOfProduct;
    private DelivererProcess delivererProcess;

    public Order( Product product,DelivererProcess delivererProcess) {
        this.delivererProcess = delivererProcess;
        this.productName = product.getProductName();
        this.countOfProduct = product.getProductCount();
    }
}
