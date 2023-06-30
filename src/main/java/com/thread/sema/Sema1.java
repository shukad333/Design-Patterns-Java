package com.thread.sema;

import java.util.stream.IntStream;

public class Sema1 {

    public static void main(String[] args) {

        IntStream.range(0,100).forEach(a-> {
            System.out.println(a);
        });

    }
}
