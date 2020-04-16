package com.kodilla.good.patterns.challenges;

public class InformationServiceImpl implements InformationService {

    @Override
    public void inform(OrderRequest orderRequest) {
        System.out.println("Product - " + orderRequest.getItem() + " of quantity " + orderRequest.quantity + " ordered");
    }

    @Override
    public void informIfNotOrdered(OrderRequest orderRequest) {
        OrderServiceImpl orderService = new OrderServiceImpl();
        System.out.println("Product not ordered, quantity to high. Max quantity available - " + orderService.getAvailableProducts().get(orderRequest.getItem()));

    }
}
