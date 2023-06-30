package com.lld.vendingmachine;

public abstract class Payment {

    abstract boolean makePayment();


}

class CardPayment extends Payment {

    @Override
    boolean makePayment() {
        System.out.println("Card");
        return true;
    }
}

class CashPayment extends Payment {
    @Override
    boolean makePayment() {
        System.out.println("Cash");
        return true;
    }
}
