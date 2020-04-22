package food2door;

public interface InformationService {

    void inform(OrderRequest orderRequest, Shop shop);

    void informIfNotOrdered(OrderRequest orderRequest);

}
