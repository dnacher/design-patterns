package creationalPatterns.builderPattern.classes.bottle;

import creationalPatterns.builderPattern.classes.bottle.ColdDrink;

public class Pepsi extends ColdDrink {

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
