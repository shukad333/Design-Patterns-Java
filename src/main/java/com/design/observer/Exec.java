package com.design.observer;

public class Exec {

    public static void main(String[] args) {

        MyPublisher publisher = new MyPublisher();
        publisher.add(new StudentObserver());
        publisher.add(new TeacherObserver());

        publisher.publish("Shuhali here ");

    }

}

class StudentObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Message in Student");
    }
}

class TeacherObserver implements Observer {
    @Override
    public void update(String message) {
        System.out.println("Message on teacher");
    }
}
