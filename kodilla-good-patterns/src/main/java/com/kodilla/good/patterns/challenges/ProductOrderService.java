package com.kodilla.good.patterns.challenges;

public class ProductOrderService implements OrderService {
    public boolean buyProduct(User user, Product product) {
        System.out.println(user.name + " " + user.surname + " bought: " + product.product);
        return true;
    }
}
