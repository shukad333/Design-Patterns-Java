package com.sd.beh.state;

public class InProgress implements PackageState{
    @Override
    public void updateState(DeliveryCOntext cOntext) {
        System.out.println("In Progress");
        cOntext.updateState(new Delivered());
    }
}
