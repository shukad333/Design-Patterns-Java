package com.itest.gm;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.LoadingCache;

public class Cache {

    com.google.common.cache.Cache<Object, Object> cache = CacheBuilder.newBuilder().build();

    public static void main(String[] args) {

    }

    public void  test() {

        cache.put("a","b");
    }
}
