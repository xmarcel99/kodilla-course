package com.kodilla.good.patterns.challenges.food2door;

public class Order {
    private String productName;
    private int countOfProduct;
    private BaseShop baseShop;

    public Order( Product product,BaseShop baseShop) {
        this.baseShop = baseShop;
        this.productName = product.getProductName();
        this.countOfProduct = product.getProductCount();
    }
}
