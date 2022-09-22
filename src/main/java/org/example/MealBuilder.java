package org.example;

import org.example.Burgers.ChickenBurger;
import org.example.Burgers.VegBurger;
import org.example.ColdDrinks.Coke;
import org.example.ColdDrinks.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
