package com.concurrency.evenodd;

public class State {

    private PrinterType next;

    public State(PrinterType type) {
        this.next = type;
    }

    public PrinterType getNext() {
        return next;
    }

    public void setNext(PrinterType next) {
        this.next = next;
    }
}
