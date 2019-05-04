package com.kodilla.good.patterns.challenges.food2door;

public class MainDeliver {
    public static void main(String[] args) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retriver();
        DelivererProductProcessor delivererProductProcessor = new DelivererProductProcessor(new ExtraFoodShop(orderRequest.getDelivererProcessName().getNameOfDeliverer(), orderRequest.getProduct())
                , new InformAboutNewDeliver(), new Repository());
        delivererProductProcessor.processor(orderRequest);
    }
}
