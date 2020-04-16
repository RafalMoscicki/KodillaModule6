package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process (final OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getQuantity());

        if (isOrdered) {
            informationService.inform(orderRequest);
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getQuantity());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            informationService.informIfNotOrdered(orderRequest);
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
