package com.cc.dd.aa;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        String[] dic = new String[]{"shuha","litcho","nooru","nanni","zoya"};
        Arrays.sort(dic);

        System.out.println(Arrays.toString(dic));
        int k = -3;
        System.out.println((~k));

        System.out.println(Arrays.binarySearch(dic,"nannu"));
        System.out.println(Arrays.binarySearch(dic,"zoya"));

    }
}
