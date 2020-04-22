package food2door;

public interface Shop {

    void addProduct(String name, int quantity);

    String getName();

    boolean order(User user, String item, int quantity);
}
