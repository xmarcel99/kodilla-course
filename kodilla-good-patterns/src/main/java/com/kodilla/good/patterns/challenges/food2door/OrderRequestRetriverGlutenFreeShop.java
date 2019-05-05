package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequestRetriverGlutenFreeShop implements OrderRequestRetriver {
    public OrderRequest retriver() {
        Product product = new Product("Apple", 12432);
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop("ExtraFoodShop", product);
        Order order = new Order(product, glutenFreeShop);
        return new OrderRequest(order, glutenFreeShop, product);
    }
}
