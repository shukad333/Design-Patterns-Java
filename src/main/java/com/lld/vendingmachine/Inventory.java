package com.lld.vendingmachine;

public interface Inventory {

    Product addProduct(Product product);
    boolean removProduct(String productId);
    Product getProduct(String productId);
}
