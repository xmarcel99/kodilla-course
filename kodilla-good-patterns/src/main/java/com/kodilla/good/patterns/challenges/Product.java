package com.kodilla.good.patterns.challenges;

public class Product {
    String product;

    public Product(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + product + '\'' +
                '}';
    }
}
