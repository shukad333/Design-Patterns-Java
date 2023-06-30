package com.myown.cache;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


interface Cache<K,V> {

}


public class TimedCache<K,V> {

    Long ttl;


    public TimedCache(Long timeOUt) {
        this.ttl = timeOUt;
        new Cleaup().start();

    }

    private class TimedEntry<V> {

        V v;
        Long createdAt;

        TimedEntry(V v) {
            this.v = v;
            createdAt = new Date().getTime();
        }

    }

    private class Cleaup extends Thread {
        @Override
        public void run() {
            while(true){
                cleanUp();
                try {
                    Thread.sleep(ttl/2);
                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    private void cleanUp() {
        System.out.println("Cleaning up");

        Iterator<Map.Entry<K,TimedEntry<V>>> it = map.entrySet().iterator();
        while(it.hasNext()) {

            K k = it.next().getKey();
            if(map.get(k).createdAt+ttl<new Date().getTime()) {
                System.out.println(" key expired "+k);
               it.remove();
            }

        }

    }

//    private Map<K,V> map = new HashMap<>();

    private Map<K,TimedEntry<V>> map = new HashMap<>();

    public void put(K k, V v) {

        map.put(k,new TimedEntry<>(v));


    }




    public V get(K k) {
        if(!map.containsKey(k))
            return null;
        TimedEntry te =  map.get(k);
        System.out.println(te.createdAt);
        if(te.createdAt+ttl < new Date().getTime()) {
            System.out.println("key expirwed!");
            return null;
        }

        return (V) te.v;
    }


}



