package creationalPatterns.builderPattern.classes;

import creationalPatterns.builderPattern.Packing;

public class Bottle implements Packing {


    @Override
    public String pack() {
        return "Bottle";
    }
}
