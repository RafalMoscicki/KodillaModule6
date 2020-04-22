package food2door;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Shop extraFoodShop = new ExtraFoodShop("ExtraFoodShop","1234567");
        extraFoodShop.addProduct("apple", 500);
        extraFoodShop.addProduct("banana", 10);

        Shop healthyShop = new HealthyShop("HealthyShop","5357688");
        healthyShop.addProduct("beans", 5);
        healthyShop.addProduct("tomato", 8);

        Shop glutenFreeShop = new GlutenFreeShop("GlutenFreeShop","85336576");
        glutenFreeShop.addProduct("hummus", 3);
        glutenFreeShop.addProduct("chicken", 6);
        glutenFreeShop.addProduct("apple", 6);

        List<Shop> shops = new LinkedList<>();
        shops.add(extraFoodShop);
        shops.add(healthyShop);
        shops.add(glutenFreeShop);

        OrderRequest orderRequest = new OrderRequest(new User("Pixel", "Ford"), "apple", 110);
        ProductOrderService productOrderService = new ProductOrderService(new InformationServiceImpl(), shops, new OrderRepositoryImpl());
        productOrderService.process(orderRequest);

       // extraFoodShop.getProductList().keySet().forEach(System.out::println);
    }
}
