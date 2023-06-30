package com.design.state;

public class LoudALert implements AlertState{

  @Override
  public void alert(MobileAlertStateContext mobileAlertStateContext) {
    System.out.println("Loud");
  }
}
