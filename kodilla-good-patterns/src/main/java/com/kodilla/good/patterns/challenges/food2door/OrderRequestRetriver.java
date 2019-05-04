package com.kodilla.good.patterns.challenges.food2door;

public class OrderRequestRetriver {
    public OrderRequest retriver() {
        Product product = new Product("Apple",12432);
        ExtraFoodShop extraFoodShop = new ExtraFoodShop("ExtraFoodShop",product);
        Order order = new Order(product,extraFoodShop);
        return new OrderRequest(order, extraFoodShop,product);
     /*  HealthyShop healthyShop = new HealthyShop("HealthyShop",product);
       Order order = new Order(product,healthyShop);
       return new OrderRequest(order,healthyShop,product);*/
    }
}
