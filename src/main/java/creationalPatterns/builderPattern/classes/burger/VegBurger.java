package creationalPatterns.builderPattern.classes.burger;

import creationalPatterns.builderPattern.classes.burger.Burger;

public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
