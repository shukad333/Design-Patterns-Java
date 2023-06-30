package com.sd.beh.state;

public class DeliveryCOntext {

    private PackageState packageState;
    String deliveryId;

    public DeliveryCOntext(String deliveryId , PackageState packageState) {
        if(packageState==null) {
            this.packageState = new Acked();
        }
    }
    void updateState(PackageState state) {
        this.packageState = state;
    }

    void update() {
        this.packageState.updateState(this);
    }

}
