package food2door;

public class GlutenFreeShop extends ShopImpl {

    public GlutenFreeShop(String name, String nip) {
        super(name, nip);
    }

    @Override
    public String getName() {
        return ExtraFoodShop.class.getSimpleName();
    }
}