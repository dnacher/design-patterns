package creationalPatterns.builderPattern.classes.burger;

import creationalPatterns.builderPattern.classes.burger.Burger;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.5f;
    }
}
