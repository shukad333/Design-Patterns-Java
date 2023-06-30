package com.design.pakkadesign.proxy;

public class ProxyInternet {

  Internet internet;
  public ProxyInternet() {
    internet = new RealInternet();
  }

  public void connect(String uri) {
    System.out.println("Checking for malicious");
    internet.connect(uri);
  }

}
