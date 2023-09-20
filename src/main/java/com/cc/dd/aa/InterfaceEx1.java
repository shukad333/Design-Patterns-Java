package com.cc.dd.aa;

public class InterfaceEx1 implements Abc{

  @Override
  public void a() {
    System.out.println("Nice");
  }

  public static void main(String[] args) {
    InterfaceEx1 i1 = new InterfaceEx1();
    i1.me();
    i1.a();
  }
}

interface Abc {
  void a();
  default void me() {
    System.out.println("Here calling!");
  }
}
