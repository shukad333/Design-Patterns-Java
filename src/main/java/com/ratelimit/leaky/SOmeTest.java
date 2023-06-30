package com.ratelimit.leaky;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SOmeTest {

    @Before
    public void setup() {
        System.out.println("Started!");
    }

    @Test
    public void testA() {
        Assert.assertTrue(1==1);
    }
}
