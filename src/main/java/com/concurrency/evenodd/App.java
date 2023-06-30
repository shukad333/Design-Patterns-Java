package com.concurrency.evenodd;

public class App {

    public static void main(String[] args) {

        State state = new State(PrinterType.ODD);
        Printer printerOdd = new Printer(1,2,state,PrinterType.ODD,PrinterType.EVEN);
        Printer printerEven = new Printer(2,2,state,PrinterType.EVEN,PrinterType.ODD);

        printerOdd.start();
        printerEven.start();




    }
}
