package com.cc.dd.aa;

public class VolatileEx1 {

    private static volatile int a;
    private static volatile Object b;
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);

    }
}
