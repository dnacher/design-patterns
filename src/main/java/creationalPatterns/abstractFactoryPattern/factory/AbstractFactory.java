package creationalPatterns.abstractFactoryPattern.factory;

import creationalPatterns.abstractFactoryPattern.classes.colors.Color;
import creationalPatterns.factoryPattern.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
