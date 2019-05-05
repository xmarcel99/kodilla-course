package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequestRetriverExtraFoodShop implements OrderRequestRetriver {
    public OrderRequest retriver() {
        Product product = new Product("Apple", 12432);
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop", product);
        Order order = new Order(product, extraFoodShop);
        return new OrderRequest(order, extraFoodShop, product);
    }
}