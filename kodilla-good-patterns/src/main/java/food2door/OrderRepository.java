package food2door;

public interface OrderRepository {

    boolean process(User user, String item, int quantity);
}
