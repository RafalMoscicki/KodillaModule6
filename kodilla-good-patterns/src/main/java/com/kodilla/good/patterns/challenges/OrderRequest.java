package com.kodilla.good.patterns.challenges;

public class OrderRequest {

    private User user;
    String item;
    int quantity;

    public OrderRequest(final User user, final String item, final int quantity) {
        this.user = user;
        this.item = item;
        this.quantity = quantity;
    }

    public User getUser() {
        return user;
    }

    public String getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}
