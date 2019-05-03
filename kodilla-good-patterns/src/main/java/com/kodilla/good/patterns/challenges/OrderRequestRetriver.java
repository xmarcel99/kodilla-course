package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriver {

    public  OrderRequest retriver() {
        User user = new User("John","Mary");
        Product product = new Product("Beer");
        return new OrderRequest(user,product);
    }
}
