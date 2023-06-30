package com.design.observer;

public interface Publisher {

    void add(Observer o);
    void remove(Observer o);
    void publish(String message);
}
