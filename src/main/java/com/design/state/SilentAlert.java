package com.design.state;

public class SilentAlert implements AlertState{

  @Override
  public void alert(MobileAlertStateContext mobileAlertStateContext) {
    System.out.println("ALert");
  }
}
