package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequest {
    private Order order;
    private  DelivererProcess delivererProcess;
    private Product product;

    public OrderRequest(Order order, DelivererProcess delivererProcess, Product product) {
        this.order = order;
        this.delivererProcess= delivererProcess;
        this.product = product;
    }
    public DelivererProcess getDelivererProcessName() {
        return delivererProcess;
    }
    public Product getProduct() {
        return product;
    }
}
