package creationalPatterns.builderPattern;

import creationalPatterns.builderPattern.classes.*;
import creationalPatterns.builderPattern.classes.bottle.Coke;
import creationalPatterns.builderPattern.classes.bottle.Pepsi;
import creationalPatterns.builderPattern.classes.burger.ChickenBurger;
import creationalPatterns.builderPattern.classes.burger.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
