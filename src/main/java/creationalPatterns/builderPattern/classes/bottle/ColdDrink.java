package creationalPatterns.builderPattern.classes.bottle;

import creationalPatterns.builderPattern.classes.Packing;
import creationalPatterns.builderPattern.classes.Item;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
