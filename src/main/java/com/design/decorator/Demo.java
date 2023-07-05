package com.design.decorator;

public class Demo {

  public static void main(String[] args) {
    Internet internet = new ProxyInternet(new RealInternet());
    internet.connect("proxy.net");

  }

}
