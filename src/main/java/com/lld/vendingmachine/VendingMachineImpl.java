package com.lld.vendingmachine;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


public class VendingMachineImpl {


    Inventory inventory;

    List<Product> cart;
    void begin() {
        cart = new ArrayList<>();

    }

    boolean addToCart(String productId) {
        Product product = inventory.getProduct(productId);
        this.cart.add(product);
        return true;
    }

    boolean checkout(List<Product> productList,Payment payment) {
        //
        int totalPrice;
        payment.makePayment();
        return true;
    }

}
