package creationalPatterns.builderPattern.classes.bottle;

import creationalPatterns.builderPattern.classes.Packing;

public class Bottle implements Packing {


    @Override
    public String pack() {
        return "Bottle";
    }
}
