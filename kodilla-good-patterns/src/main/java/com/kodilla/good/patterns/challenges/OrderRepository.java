package com.kodilla.good.patterns.challenges;

public interface OrderRepository {

    boolean createOrder(User user, String item, int quantity);
}
