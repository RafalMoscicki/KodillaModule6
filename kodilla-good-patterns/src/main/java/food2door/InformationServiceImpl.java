package food2door;

public class InformationServiceImpl implements InformationService {

    @Override
    public void inform(OrderRequest orderRequest, Shop shop) {
        System.out.println("Product - " + orderRequest.getItem() + " of quantity " + orderRequest.getQuantity() + " ordered from " + shop.getName());
    }

    @Override
    public void informIfNotOrdered(OrderRequest orderRequest) {
        System.out.println("Product not ordered");
    }
}
