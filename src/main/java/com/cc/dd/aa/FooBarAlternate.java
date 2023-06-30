package com.cc.dd.aa;


import java.util.concurrent.Semaphore;

class FooBar {
    private int n;
    Semaphore foo = new Semaphore(1);
    Semaphore bar = new Semaphore(0);

    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            foo.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            bar.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            bar.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            foo.release();
        }
    }
}

class BarThread extends Thread {
    FooBar fooBar;

    public BarThread(FooBar fooBar) {
        this.fooBar = fooBar;
    }

    Runnable runnable = () -> System.out.println("Bar");
    @Override
    public void run() {

        try {
            fooBar.bar(runnable);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}

class FooThread extends Thread {
    FooBar fooBar;

    public FooThread(FooBar fooBar) {
        this.fooBar = fooBar;
    }

    Runnable runnable = () -> System.out.println("Foo");
    @Override
    public void run() {

        try {
            fooBar.foo(runnable);
        } catch (InterruptedException exception) {
            exception.printStackTrace();
        }
    }
}

public class FooBarAlternate {

    public static void main(String[] args) {

        FooBar fooBar = new FooBar(10);
        FooThread fooThread = new FooThread(fooBar);
        BarThread barThread = new BarThread(fooBar);

        fooThread.start();
        barThread.start();


    }

}
