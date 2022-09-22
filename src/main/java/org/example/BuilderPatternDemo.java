package org.example;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal nonVeganMeal =  mealBuilder.prepareNonVegMeal();
        nonVeganMeal.showItems();
        System.out.println("You should pay: " + nonVeganMeal.getCost() + " UAH");
    }
}