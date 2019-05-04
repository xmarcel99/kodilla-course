package com.kodilla.good.patterns.challenges.food2door;

public class DelivererProductProcessor {
    private DelivererProcess delivererProcess;
    private DeliverInformation deliverInformation;
    private RepositorySaving repositorySaving;

    public DelivererProductProcessor(DelivererProcess delivererProcess, DeliverInformation deliverInformation, RepositorySaving repositorySaving) {
        this.delivererProcess = delivererProcess;
        this.deliverInformation = deliverInformation;
        this.repositorySaving = repositorySaving;
    }
    public DelivererDto processor(OrderRequest orderRequest) {
        boolean isAllowedDeliver = orderRequest.getDelivererProcessName().process();
        if(isAllowedDeliver) {
            deliverInformation.deliverInformation();
            repositorySaving.saveDeliverInRepository();
            return new DelivererDto(delivererProcess,true);
        }else {
            System.out.println("Ups... We don't have products which you would like to order :( ");
            return  new DelivererDto(delivererProcess,false);
        }
    }
}
