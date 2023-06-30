package com.design.observer;

import java.util.ArrayList;
import java.util.List;

public class MyPublisher implements Publisher{


    List<Observer> observers = new ArrayList<>();

    @Override
    public void add(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        observers.remove(o);
    }

    @Override
    public void publish(String message) {
        for(Observer o : observers)
            o.update(message);
    }
}
