package com.kodilla.good.patterns.challenges.food2door;

public class DelivererDto {
    private BaseShop baseShop;
    private boolean isAllowedDeliver;

    public DelivererDto(BaseShop baseShop, boolean isAllowedDeliver) {
        this.baseShop = baseShop;
        this.isAllowedDeliver = isAllowedDeliver;
    }
}
