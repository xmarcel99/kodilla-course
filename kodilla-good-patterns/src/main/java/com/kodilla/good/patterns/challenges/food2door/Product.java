package com.kodilla.good.patterns.challenges.food2door;

public class Product {
    private String productName;
    private int productCount;

    public Product(String productName, int productCount) {
        this.productName = productName;
        this.productCount = productCount;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductCount() {
        return productCount;
    }
}
