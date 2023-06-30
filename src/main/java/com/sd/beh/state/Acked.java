package com.sd.beh.state;

public class Acked implements PackageState{

    @Override
    public void updateState(DeliveryCOntext cOntext) {
        System.out.println("Acked");
        cOntext.updateState(new InProgress());
    }
}
