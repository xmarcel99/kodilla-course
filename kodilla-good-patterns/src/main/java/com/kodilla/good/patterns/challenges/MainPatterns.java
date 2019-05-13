package com.kodilla.good.patterns.challenges;

public class MainPatterns {
    public static void main(String[] args) {
        OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
        OrderRequest orderRequest = orderRequestRetriver.retriver();
        ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(new MailService(), new ProductOrderService(), new ProductOrderRepository());
        productOrderProcessor.processor(orderRequest);
    }
}
