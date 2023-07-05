package com.design.prototype;

import java.util.HashMap;
import java.util.Map;

public class WeapomStore {

  private static Map<String,Weapon> weapons = new HashMap<>();

  static  {
    weapons.put("gun",new Gun());
    weapons.put("bomb",new Bomb());
  }

  public static Weapon getWeapon(String weaponName) throws CloneNotSupportedException {
    return (Weapon) weapons.get(weaponName).clone();
  }

}
