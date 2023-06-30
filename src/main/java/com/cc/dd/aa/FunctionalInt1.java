package com.cc.dd.aa;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInt1 {

    public static void main(String[] args) {

        BiPredicate<String,Integer> biPredicate = (a,b)->{
            return a.equals("") && b==0;
        };

        System.out.println(biPredicate.test("",0));
        System.out.println(biPredicate.test("",10));

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Accepted "+s);
            ;
            }
        };

        consumer.accept("shu");

        Supplier<String> supplier = ()-> {return "consu shu";};

        System.out.println(supplier.get());


        Function<String,String> function = (a)-> {return "added "+a;};

        System.out.println(function.apply("litchi"));



    }
}
