package com.sd.creational.sigleton;

public class FactoryEx {

    private static FactoryEx instance;

    private FactoryEx() {

    }


    public static FactoryEx getInstance() {
        if(null==instance) {
            synchronized (FactoryEx.class) {
                if(null == instance) {
                    instance = new FactoryEx();
                }
            }
        }

        return instance;
    }


    public String getProp() {
        return "Hello";
    }



}
