package creationalPatterns.builderPattern.classes.burger;

import creationalPatterns.builderPattern.classes.Packing;
import creationalPatterns.builderPattern.classes.Item;
import creationalPatterns.builderPattern.classes.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
