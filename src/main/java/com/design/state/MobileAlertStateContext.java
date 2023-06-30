package com.design.state;

public class MobileAlertStateContext {

  private AlertState alertState;

  public MobileAlertStateContext() {
    alertState = new SilentAlert();
  }

  public void setState(AlertState alertState) {
    this.alertState = alertState;
  }

  public void alert() {
    alertState.alert(this);
  }

}
