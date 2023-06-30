package com.h.rl;

public abstract class RateLimiter {

    protected  int maxRequests;

    protected RateLimiter(int max) {
        this.maxRequests = max;
    }

    abstract boolean allow();
}
