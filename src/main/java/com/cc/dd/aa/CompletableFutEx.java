package com.cc.dd.aa;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutEx {

    public static void main(String[] args) throws ExecutionException, InterruptedException {


        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{
            try {
                Thread.sleep(20000);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            return "Hello";
        });
        System.out.println(completableFuture.isDone());

    }
}
