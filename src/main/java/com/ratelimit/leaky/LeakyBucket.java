package com.ratelimit.leaky;

import java.util.LinkedList;
import java.util.Queue;

public class LeakyBucket {
}



class LB {
    Queue<Long> queue = new LinkedList<>();


    int req , time;
    public LB(int req , int time) {
        this.req = req;
        this.time = time;
    }

    public boolean   hit(long ts) {
        Long currTs = System.currentTimeMillis();

        while(!queue.isEmpty() && currTs - queue.peek()>req) {
            queue.poll();
        }

        if(queue.size()<req) {
            queue.add(currTs);
            return true;
        }

        return false;

    }

}
