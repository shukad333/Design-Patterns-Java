package com.concurrency.evenodd;

import com.concurrency.evenodd.State;
public class Printer extends Thread{


    int start,inc;
    com.concurrency.evenodd.State state;
    PrinterType curr , next;
    public Printer(int start ,int inc,com.concurrency.evenodd.State state, PrinterType curr , PrinterType next ) {
        this.start = start;
        this.inc = inc;
        this.curr = curr;
        this.next = next;
        this.state = state;
    }

    @Override
    public void run(){

        while(start<100) {
            synchronized (state) {
                while(curr!=state.getNext()) {
                    try {
                        state.wait();
                    } catch (InterruptedException exception) {
                        exception.printStackTrace();
                    }
                }
                System.out.println(start);
                start+=inc;
                state.setNext(next);
                state.notifyAll();
            }
        }

    }
}
