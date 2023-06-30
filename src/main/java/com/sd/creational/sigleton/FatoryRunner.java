package com.sd.creational.sigleton;

public class FatoryRunner {

    public static void main(String[] args) {

        String proper = FactoryEx.getInstance().getProp();
        System.out.println(proper);


    }
}
