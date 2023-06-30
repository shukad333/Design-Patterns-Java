package com.cc.dd.aa;

public class DefInterface {

    public static void main(String[] args) {
        A a = new A();
        a.printA();
        a.shu();
        System.out.println(ABC.conv());
    }

}


class A implements ABC {
    @Override
    public void shu() {
        System.out.println("Shu overiden");;
    }
}


interface ABC {

    static int conv() {
        return 10;
    }
    default void printA() {
        System.out.println("Shu");
    }
    void shu();
}
