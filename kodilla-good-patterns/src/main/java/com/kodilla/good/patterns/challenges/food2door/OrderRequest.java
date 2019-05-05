package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {
    private Order order;
    private  BaseShop baseShop;
    private Product product;

    public OrderRequest(Order order, BaseShop baseShop, Product product) {
        this.order = order;
        this.baseShop= baseShop;
        this.product = product;
    }
    public BaseShop getDelivererProcessName() {
        return baseShop;
    }
    public Product getProduct() {
        return product;
    }
}
