package com.h.rl;

public class LeakyBucket extends LeakyBuckInt{


    public static void main(String[] args) {


        

    }



    private final long REQUEST_INTERVAL_MILLIS;

    private long nextReq;
    public LeakyBucket(int maxAllowed) {
            super(maxAllowed);
            REQUEST_INTERVAL_MILLIS = 1000/maxAllowed;
            nextReq = System.currentTimeMillis();
    }



    @Override
    public boolean allow() {
        long curr = System.currentTimeMillis();
        if(curr>=nextReq) {
            nextReq = curr+REQUEST_INTERVAL_MILLIS;
            return true;
        }
        return false;
    }
}


 abstract class LeakyBuckInt {
    protected final int maxReqPerSec;
    public LeakyBuckInt(int maxReqPerSec) {
        this.maxReqPerSec = maxReqPerSec;
    }
    abstract boolean allow();
}
