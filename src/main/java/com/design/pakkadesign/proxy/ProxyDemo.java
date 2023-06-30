package com.design.pakkadesign.proxy;

public class ProxyDemo {



  public static void main(String[] args) {

    ProxyInternet internet = new ProxyInternet();
    internet.connect("abc");
  }

}
