package com.h.rl;

public class LeakBucket extends RateLimiter{


    private long nextAllowedTime;

    private final long REQUEST_INTERVAL_MILLIS;

    public LeakBucket(int max) {
        super(max);
        REQUEST_INTERVAL_MILLIS = 1000/max;
        nextAllowedTime = System.currentTimeMillis();
    }

    @Override
    boolean allow() {
        long currTime = System.currentTimeMillis();
        System.out.println("Curr "+currTime+" next "+nextAllowedTime);
        synchronized (this) {
            if(currTime>=nextAllowedTime) {
                nextAllowedTime = currTime + REQUEST_INTERVAL_MILLIS;
                return true;
            }
        }
        System.out.println("Cannot allow");
        return false;
    }
}
