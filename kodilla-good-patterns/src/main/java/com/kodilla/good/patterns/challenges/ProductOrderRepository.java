package com.kodilla.good.patterns.challenges;

public class ProductOrderRepository implements  OrderRepository {
    public void addToRepository(User user,Product product) {
        System.out.println(user.name + " " + user.surname + " with product: " + product.product + " is adding to repository now...");
    }
}
