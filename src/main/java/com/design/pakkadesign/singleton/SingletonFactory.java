package com.design.pakkadesign.singleton;

public class SingletonFactory {

  private static SingletonFactory instance;

  private SingletonFactory(){};

  public static SingletonFactory getInstance() {
      if(instance == null) {
        synchronized (SingletonFactory.class) {
          if(instance == null) {
            instance = new SingletonFactory();
          }
        }
      }
      return instance;
  }


  void useMe() {
    System.out.println("used!");
  }

}
