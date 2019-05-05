package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequestRetriverHealthyShop implements OrderRequestRetriver {
    public OrderRequest retriver() {
        Product product = new Product("Apple", 12432);
        HealthyShop healthyShop = new HealthyShop("HealthyShop", product);
        Order order = new Order(product, healthyShop);
        return new OrderRequest(order, healthyShop, product);
    }
}
