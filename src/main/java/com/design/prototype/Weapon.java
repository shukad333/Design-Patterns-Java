package com.design.prototype;

public abstract class Weapon implements Cloneable{

  protected String weaponType;

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  protected abstract void addFeature(String feature);
}
