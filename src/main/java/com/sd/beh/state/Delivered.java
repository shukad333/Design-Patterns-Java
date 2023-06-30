package com.sd.beh.state;

public class Delivered implements PackageState{
    @Override
    public void updateState(DeliveryCOntext cOntext) {
        System.out.println("Delivered");
    }
}
