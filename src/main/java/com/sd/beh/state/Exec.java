package com.sd.beh.state;

public class Exec {

    public static void main(String[] args) {

        DeliveryCOntext cOntext = new DeliveryCOntext("123",null);

        cOntext.update();
        cOntext.update();
        cOntext.update();

    }
}
