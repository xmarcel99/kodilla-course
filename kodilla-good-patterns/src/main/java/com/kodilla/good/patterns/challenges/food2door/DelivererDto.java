package com.kodilla.good.patterns.challenges.food2door;

public class DelivererDto {
    private DelivererProcess delivererProcess;
    private boolean isAllowedDeliver;

    public DelivererDto(DelivererProcess delivererProcess, boolean isAllowedDeliver) {
        this.delivererProcess = delivererProcess;
        this.isAllowedDeliver = isAllowedDeliver;
    }
}
