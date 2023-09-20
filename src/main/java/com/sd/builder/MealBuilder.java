package com.sd.builder;

public class MealBuilder {

  public Meal prepareVegMeal() {
    Meal meal = new Meal();
    meal.addItem(new VegBurger());
    meal.addItem(new Pepsi());
    return meal;
  }

}
