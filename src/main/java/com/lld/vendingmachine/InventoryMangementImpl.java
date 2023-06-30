package com.lld.vendingmachine;

import java.util.Iterator;
import java.util.List;

public class InventoryMangementImpl implements Inventory{

    List<Product> productList;


    @Override
    public Product addProduct(Product product) {
        productList.add(product);
        return product;
    }

    @Override
    public boolean removProduct(String productId) {
        Iterator<Product> it = productList.iterator();
        while (it.hasNext()) {
            Product curr = it.next();
            if(curr.id.equals(productId))
                it.remove();
        }

        return true;
    }

    @Override
    public Product getProduct(String productId) {
        return null;
    }
}
