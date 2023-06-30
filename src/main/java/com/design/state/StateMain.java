package com.design.state;

public class StateMain {

  public static void main(String[] args) {

    MobileAlertStateContext mobileAlertStateContext = new MobileAlertStateContext();
    mobileAlertStateContext.alert();

    mobileAlertStateContext.setState(new LoudALert());
    mobileAlertStateContext.alert();

  }

}
