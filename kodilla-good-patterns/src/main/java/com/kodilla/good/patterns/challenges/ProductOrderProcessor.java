package com.kodilla.good.patterns.challenges;

public class ProductOrderProcessor {
    private InformationOrder informationService;
    private OrderService rentalService;
    private OrderRepository rentalRepository;

    public ProductOrderProcessor(InformationOrder informationOrder, OrderService rentalService, OrderRepository rentalRepository) {
        this.informationService = informationOrder;
        this.rentalService = rentalService;
        this.rentalRepository = rentalRepository;
    }

    public OrderDto processor(final OrderRequest orderRequest) {
        boolean isAllowedToBuy = rentalService.buyProduct(orderRequest.getUser(), orderRequest.getProduct());
        if (isAllowedToBuy) {
            informationService.inform(orderRequest.getUser());
            rentalRepository.addToRepository(orderRequest.getUser(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
