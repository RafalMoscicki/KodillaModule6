package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public class OrderServiceImpl implements OrderService {

    private final Map<String, Integer> availableProducts;

    public Map<String, Integer> getAvailableProducts() {
        return availableProducts;
    }

    public OrderServiceImpl() {
        availableProducts = new HashMap<>();
        availableProducts.put("food", 5);
        availableProducts.put("toothbrush", 10);
    }

    @Override
    public boolean order(User user, String item, int quantity) {
        Integer availableCount = availableProducts.get(item);
        if (availableCount >= quantity) {
            availableProducts.put(item, availableProducts.get(item) - quantity);
            return true;
        }
        return false;
    }
}
