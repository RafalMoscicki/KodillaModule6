package food2door;

public class ExtraFoodShop extends ShopImpl {

    public ExtraFoodShop(String name, String nip) {
        super(name, nip);
    }

    @Override
    public String getName() {
        return ExtraFoodShop.class.getSimpleName();
    }

    @Override
    public boolean order(User user, String item, int quantity) {
        int realQuantity = quantity;
        if (quantity > 10 ) {
            realQuantity = 10;
        }

        Integer availableCount = products.get(item);
        if (availableCount == null) {
            return false;
        }

        if (availableCount >= realQuantity) {
            products.put(item, products.get(item) - realQuantity);
            return true;
        }
        return false;
    }
}
