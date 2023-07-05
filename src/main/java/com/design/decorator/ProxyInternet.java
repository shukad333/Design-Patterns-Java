package com.design.decorator;

public class ProxyInternet implements Internet{

  Internet internet;
  public ProxyInternet(Internet internet) {
    this.internet = internet;
  }

  @Override
  public void connect(String url) {
    System.out.println("Filtering");
    internet.connect(url);
  }
}
