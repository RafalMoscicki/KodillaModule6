package com.kodilla.good.patterns.challenges;
public class Main {

    public static void main(String[] args) {

        OrderRequest orderRequest = new OrderRequest(new User("Pixel", "Ford"), "food", 6);
        ProductOrderService productOrderService = new ProductOrderService(new InformationServiceImpl(), new OrderServiceImpl(), new OrderRepositoryImpl());
        productOrderService.process(orderRequest);

    }
}
