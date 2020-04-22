package food2door;

public class HealthyShop extends ShopImpl {

    public HealthyShop(String name, String nip) {
        super(name, nip);
    }

    @Override
    public String getName() {
        return ExtraFoodShop.class.getSimpleName();
    }
}
