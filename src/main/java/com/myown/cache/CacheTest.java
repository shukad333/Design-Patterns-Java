package com.myown.cache;

public class CacheTest {

    public static void main(String[] args) throws InterruptedException {


        TimedCache<String,Integer> tc = new TimedCache(30000l);

        tc.put("shu",13);
        tc.put("litchi",14);
        System.out.println(tc.get("shu"));
        Thread.sleep(31000);
        System.out.println(tc.get("litchi"));

    }
}
