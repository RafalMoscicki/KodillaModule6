package food2door;

import java.util.HashMap;
import java.util.Map;

public abstract class ShopImpl implements Shop {

    private final String name;
    private final String nip;
    protected final Map<String, Integer> products;

    public ShopImpl(final String name, final String nip) {
        this.name = name;
        this.nip = nip;
        this.products = new HashMap<>();
    }

    public Map<String, Integer> getProductList() {
        return products;
    }

    public String getNip() {
        return nip;
    }

    @Override
    public void addProduct(String name, int quantity) {
        products.put(name, quantity);
    }

    @Override
    public boolean order(User user, String item, int quantity) {
        Integer availableCount = products.get(item);
        if (availableCount == null) {
            return false;
        }

        if (availableCount >= quantity) {
            products.put(item, products.get(item) - quantity);
            return true;
        }
        return false;
    }
}
