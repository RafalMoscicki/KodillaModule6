package food2door;

import java.util.List;

public class ProductOrderService {

    private InformationService informationService;
    private OrderRepository orderRepository;
    private List<Shop> shops;

    public ProductOrderService(final InformationService informationService, final List<Shop> shops, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.shops = shops;
        this.orderRepository = orderRepository;
    }

    public OrderDto process (final OrderRequest orderRequest) {
        boolean isOrdered = false;
        Shop shopOrdered = null;
        for (Shop shop : shops) {
            if (!isOrdered) {
                isOrdered = shop.order(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getQuantity());
                if (isOrdered) {
                    shopOrdered = shop;
                }
            }

        }

        if (isOrdered) {
            informationService.inform(orderRequest, shopOrdered);
            orderRepository.process(orderRequest.getUser(), orderRequest.getItem(), orderRequest.getQuantity());
            return new OrderDto(orderRequest.getUser(), true);
        } else {
            informationService.informIfNotOrdered(orderRequest);
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
