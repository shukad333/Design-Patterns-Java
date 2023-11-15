package com.cc.dd.aa;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInt1 {

    public static void main(String[] args) {

        BiPredicate<String,Integer> biPredicate = (a,b)->{
            return a.equals("") && b==0;
        };

        System.out.println(biPredicate.test("",0));
        System.out.println(biPredicate.test("",10));

        Consumer<Integer> consumer12 = (a)-> {
            System.out.println(a+" hi");
        };
        consumer12.accept(123);
        Consumer<String> consumer = new Consumer<>() {
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

        Consumer<String> consumer1 = (a)-> System.out.println(a);
        consumer1.accept("MNASDSD");




        TriFunction<String,String,String,Integer> tf = (a,b,c) -> {return 12;};

        System.out.println(tf.apply("we","xvc","ll"));


        Predicate<String> p = (a)->a.isEmpty();
        p.test("Shuhail");
        System.out.println(p.test(""));
        System.out.println(p.test("shu"));
    }
}

@FunctionalInterface
interface TriFunction<A,B,C,D> {

    D apply(A a, B b , C c);

}
