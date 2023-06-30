package com.design.chainofcommand;

public abstract class Middleware {

  private Middleware next;

  public static Middleware link(Middleware first, Middleware... chain) {

    Middleware head = first;
    for(Middleware middleWare : chain) {
      head.next = middleWare;
      head = head.next;
    }

      return first;
  }


  public abstract boolean check(String email , String password);

  protected boolean checkNext(String email , String password) {
    if(next == null) {
      return true;
    }

    return next.check(email, password);
  }

}
