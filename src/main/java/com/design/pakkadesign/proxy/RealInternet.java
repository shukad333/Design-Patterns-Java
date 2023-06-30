package com.design.pakkadesign.proxy;

public class RealInternet implements Internet{

  @Override
  public void connect(String uri) {
    System.out.println("Connecting to "+uri);
  }
}
