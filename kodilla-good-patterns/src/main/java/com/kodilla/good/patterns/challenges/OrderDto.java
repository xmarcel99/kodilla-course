package com.kodilla.good.patterns.challenges;

public class OrderDto {
    boolean canBuy;
    User user;

    public OrderDto(User user, boolean canBuy) {
        this.canBuy = canBuy;
        this.user = user;
    }

    public boolean isCanBuy() {
        return canBuy;
    }

    public User getUser() {
        return user;
    }
}
